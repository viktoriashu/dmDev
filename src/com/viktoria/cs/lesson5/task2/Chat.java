package com.viktoria.cs.lesson5.task2;

import java.util.Objects;

//модификаторы доступа package-private установленны намеренно

class Chat {
    final private String name;

    final private User user;


    Chat(String name, User user) {
        this.name = name;
        this.user = user;
    }

    User getUser() {
        return user;
    }


    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
