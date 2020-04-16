package pl.coderslab.test;

import pl.coderslab.Dao.GroupDao;
import pl.coderslab.model.Group;

public class GroupTest {
    public static void main(String[] args) {
        Group group1 = new Group(1, "volleyball");
        GroupDao groupDao = new GroupDao();
        //groupDao.create(group1);
        Group group2 = new Group(2, "football");
        //groupDao.create(group1);
        Group group3 = new Group(3, "handball");
        //groupDao.create(group3);
        Group groupDel = new Group(4, "delete");
        //groupDao.create(groupDel);
        //groupDao.delete(4);
        //groupDao.read(2);
        //groupDao.update(group2);

        for (int i = 0; i < groupDao.findAll().length; i++) {
            groupDao.printGroup(groupDao.findAll()[i]);
            
        }
    }
}
