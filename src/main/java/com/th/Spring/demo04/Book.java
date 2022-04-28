package com.th.Spring.demo04;

@SuppressWarnings("FieldCanBeLocal")
public class Book {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        if (name != null) {
            return name;
        }

        return "Book{" +
                "name='" + null + '\'' +
                '}';
    }
}
