package dao;

import domain.homework;

public interface UserDao {
    void register(homework user);

    boolean isRegister(String username);

    homework findUserByUP(homework user);
}
