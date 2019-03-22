package model;

public class user {

    public String name;
    public String password;
    public String type;

    public user(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public user(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return  name+
                ":" + password +
                ":" + type +
                '!';
    }
}
