package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.homework;
import service.UserService;

import java.io.File;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoImpl();
    @Override
    public void register(homework user) {
        dao.register(user);
    }

    @Override
    public boolean findUsername(String username) {
        return dao.isRegister(username);
    }

    @Override
    public homework findUserByUP(homework user) {
        return dao.findUserByUP(user);
    }

    @Override
    public File createDirs(String username) {
        File dirs = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\homework\\" + username);
        boolean flag = dirs.mkdirs();
        return dirs;
    }
}
