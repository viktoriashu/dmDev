package com.viktoria.cs.lesson5.task1;

import com.viktoria.cs.lesson5.task2.User;

import java.util.*;
import java.util.function.Predicate;
//модификаторы доступа package-private установленны намеренно
class ChatRunner {


    public static void main(String[] args) {

//это первая задача
        List<Chat> chatList = Arrays.asList(
                new Chat("Dog lovers", 4785),
                new Chat("Cat lovers", 4785),
                new Chat("Alien lovers", 6143),
                new Chat("Ice cream lovers", 925),
                new Chat("Lovers of sleep", 158325)
        );


        List <Chat> result = new ArrayList<>();

        chatList.forEach(chat -> {if(chat.getUsers() >= 1000){
            result.add(chat);}});

        result.sort(new UsersComparator().thenComparing(new NameComparator()));
        System.out.println(result);
        result.sort(Comparator.comparing(Chat::getName));
        System.out.println(result);
    }



    private static class UsersComparator implements Comparator<Chat>{

        @Override
        public int compare(Chat o1, Chat o2) {
            return Integer.compare(o2.getUsers(), o1.getUsers());
        }

    }
    private static class NameComparator implements Comparator<Chat>{

        @Override
        public int compare(Chat o1, Chat o2) {
            return o1.getName().compareTo(o2.getName());
        }

    }
}
