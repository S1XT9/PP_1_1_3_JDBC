package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.engine.jdbc.connections.internal.DriverConnectionCreator;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Ivanovich", (byte) 32);
        userDao.saveUser("Oleg", "Olegovich", (byte) 31);
        userDao.saveUser("Revolver", "Coltovich", (byte) 30);
        userDao.saveUser("Vladimir", "Vladimirov", (byte) 32);
        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
