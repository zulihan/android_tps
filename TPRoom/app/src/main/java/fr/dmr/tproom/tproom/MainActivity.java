package fr.dmr.tproom.tproom;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fr.dmr.tproom.tproom.db.AppDatabase;
import fr.dmr.tproom.tproom.entity.User;
import fr.dmr.tproom.tproom.entity.UserDao;

public class MainActivity extends AppCompatActivity {

    private UserDao dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "users.db").build();

        dao = db.userDao();
    }

    public void clickUserAdd(View v){
        User u = new User();
        u.setFirstName("Ginette");
        u.setLastName("DURAND");
        UseDBTask useDBTask = new UseDBTask();
        useDBTask.execute(u);
    }

    class UseDBTask extends AsyncTask<User, Integer, Integer>{

        @Override
        protected Integer doInBackground(User... users) {

            dao.insertAll(users);
            return 1;
        }
    }

}
