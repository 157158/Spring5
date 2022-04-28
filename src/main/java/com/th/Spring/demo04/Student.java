package com.th.Spring.demo04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("FieldCanBeLocal")
public class Student {
    private String[] courses;
    private List<String> language;
    private Map<String, String> testScores;
    private Set<String> addressBook;
    private List<Book> books;
    private List<String> list;
    private Map<String, String> map;

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", language=" + language +
                ", testScores=" + testScores +
                ", addressBook=" + addressBook +
                ", books=" + books +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public void setAddressBook(Set<String> addressBook) {
        this.addressBook = addressBook;
    }

    public void setTestScores(Map<String, String> testScores) {
        this.testScores = testScores;
    }


    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
