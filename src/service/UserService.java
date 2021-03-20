package service;

import domain.homework;

import java.io.File;

public interface UserService {
    void register(homework user);

    boolean findUsername(String username);

    homework findUserByUP(homework user);

    File createDirs(String username);
}
