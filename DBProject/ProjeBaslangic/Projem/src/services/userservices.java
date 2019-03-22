package services;

import model.user;

import java.util.List;

public interface userservices {

    user loginUser(user user);
    boolean logoutUser(String username);
    void registerUser(user user);
    List<String> listUser();

}
