package fr.dmr.tproom.tproom.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import fr.dmr.tproom.tproom.entity.User;
import fr.dmr.tproom.tproom.entity.UserDao;

/**
 * Created by dmr on 19/01/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}