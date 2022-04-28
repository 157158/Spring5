package com.th.Spring.demo02;

public class Server {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void add() {
        System.out.println("add...");
        user.update();
    }
}
