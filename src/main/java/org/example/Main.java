package org.example;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = Boolean.valueOf("true");

        FormDate postm = new FormDate();
        postm.birthDay = 13;
        postm.birthMonth = 6;
        postm.birthYear = 1999;
    }

}