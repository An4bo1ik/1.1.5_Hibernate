package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();

        userDao.saveUser("Люк", "Скайуокер", (byte) 20);
        userDao.saveUser("Боба", "Фетт", (byte) 29);
        userDao.saveUser("Хан", "Соло", (byte) 31);
        userDao.saveUser("Мейс", "Винду", (byte) 38);

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        // реализуйте алгоритм здесь*/
    }
}
