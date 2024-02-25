package com.viktoria.cs.lesson5.task1;

import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;


//модификаторы доступа package-private установленны намеренно
class Chat {
    final private String name;
    final private int users;


    public Chat(String name, int users) {
        this.name = name;
        this.users = users;
    }


     String getName() {
        return name;
    }


    int getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Chat chat = (Chat) object;
        return users == chat.users && Objects.equals(name, chat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }
}
