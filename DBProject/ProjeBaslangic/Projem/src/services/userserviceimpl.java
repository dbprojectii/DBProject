package services;

import model.user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userserviceimpl implements userservices {

    static File file = new File("user.bin");
    static Scanner info = new Scanner(System.in);


    public user loginUser(user user) {
        user loginUser = null;
        try {
            BufferedReader buff = new BufferedReader(new FileReader(file));
            while (buff.ready()) {
                String read = buff.readLine();

                String[] loginArray = read.split("!");
                for (int i = 0; i < loginArray.length; i++) {
                    String RegisterArray[] = loginArray[i].split(":");
                    if (user.name.equals(RegisterArray[0]) && user.password.equals(RegisterArray[1])) {
                        loginUser = new user(RegisterArray[0], RegisterArray[1], RegisterArray[2]);
                        System.out.println("Welcome");
                    } else {
                        System.out.println("You have enter wrong username or password, try again.");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginUser;
    }

    public boolean logoutUser(String username) {
        System.out.println("see you " + username);
        return false;
    }

    public void registerUser(user user) {
        try {
            BufferedWriter buffw = new BufferedWriter(new FileWriter(file, true));
            buffw.write(user.toString());
            buffw.newLine();
            buffw.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public List<String> listUser() {
        List<String> users = new ArrayList<>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(file));
            while (buff.ready()) {
                String read = buff.readLine();
                users.add(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

}