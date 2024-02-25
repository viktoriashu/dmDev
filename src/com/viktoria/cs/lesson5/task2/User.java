package com.viktoria.cs.lesson5.task2;

import java.util.Objects;
//модификаторы доступа package-private установленны намеренно
public class User {
    final private int id;
    final private String userName;
    final private int age;

    public User(int id, String userName, int age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    int getId() {
        return id;
    }

    String getUserName() {
        return userName;
    }

    int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName  +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id && age == user.age && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, age);
    }
}
