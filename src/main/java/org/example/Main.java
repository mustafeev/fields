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
        post.subscription = "true";

        FormDate post= new FormDate();
        post.birthDay = 13.;
        post.birthMonth = 6.;
        post.birthYear = 1999.;
    }


}