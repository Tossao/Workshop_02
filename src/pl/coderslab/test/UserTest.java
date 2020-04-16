package pl.coderslab.test;

import pl.coderslab.Dao.UserDao;
import pl.coderslab.model.User;

public class UserTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = new User(1,"Kubiak", "kubiak@gmail.com", "123qwe", 1);
        User user2 = new User(2,"Kurek", "kuras@hotmail.com", "asdzxc", 1);
        User user3 = new User(3,"Zatorski", "zati@o2.pl", "qweasd", 1);
        User user4 = new User(4,"Lewandowski", "lewy@gmail.com", "123qwe", 2);
        User user5 = new User(5,"Messi", "leo@hotmail.com", "qweasd", 2);
        User user6 = new User(6,"Ronaldo", "lalus@gmail.com", "asdzxc", 2);
        User user7 = new User(7,"Jordan", "mike@gmail.com", "123qwe", 3);
        User user8 = new User(8,"Carry", "steph@hotmail.com", "asdzxc", 3);
        User user9 = new User(9,"James", "lebron@gmail.com", "qweasd", 3);
        User user10 = new User(10,"Drzyzga", "sypacz@gmail.com", "123qwe", 1);
//        userDao.create(user1);
//        userDao.create(user2);
//        userDao.create(user3);
//        userDao.create(user4);
//        userDao.create(user5);
//        userDao.create(user6);
//        userDao.create(user7);
//        userDao.create(user8);
//        userDao.create(user9);
//        userDao.create(user10);
//
//        for (int i = 0; i <userDao.findAll().length ; i++) {
//            userDao.printUser(userDao.findAll()[i]);
//        }

//        for (int i = 0; i <userDao.findAllByGroupId(1).length ; i++) {
//            userDao.printUser(userDao.findAllByGroupId(1)[i]);
//        }


    }
}
