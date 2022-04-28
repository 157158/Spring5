package com.th.Spring.demo02;

public class UserImp implements User {

    @Override
    public void update() {
        System.out.println(getClass().getSimpleName() + "UpDate");
    }
}
