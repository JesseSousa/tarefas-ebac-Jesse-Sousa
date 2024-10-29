package br.com.jessesousa;

import java.util.*;

@Tabela(nome = "users")
public class UserList {
    private List<User> users;

    public UserList(List<String[]> usersData) {
        this.users = new ArrayList<>();

        for (int i = 0; i < usersData.size(); i++) {
            String[] userData = usersData.get(i);
            User user = new User(userData[0], userData[1], userData[2]);
            this.users.add(user);
        }
    }

    public void printUsers() {
        for (User user : this.users) {
            System.out.println("USER: " + user.getName());
            System.out.println("PHONE: " + user.getPhoneNumber());
            System.out.println("EMAIL: " + user.getEmail());
            System.out.println();
        }
    }
}
