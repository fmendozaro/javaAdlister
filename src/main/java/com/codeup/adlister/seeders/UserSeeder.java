package com.codeup.adlister.seeders;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

/**
 * Created by Fer on 12/13/16.
 */
public class UserSeeder {
    public static void main(String[] args){
        User user = new User("admin", "admin@mail.com", "pass");
        DaoFactory.getUsersDao().insert(user);
        user = new User("ana", "ana@mail.com", "pass");
        DaoFactory.getUsersDao().insert(user);
        user = new User("fer", "fer@mail.com", "pass");
        DaoFactory.getUsersDao().insert(user);
    }
}
