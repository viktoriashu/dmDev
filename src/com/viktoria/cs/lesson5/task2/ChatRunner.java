package com.viktoria.cs.lesson5.task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
//модификаторы доступа package-private установленны намеренно
class ChatRunner {

    public static void main(String[] args) {

        List<Chat> userChatList = Arrays.asList(
                new Chat("Dog lovers", new User(11, "Boris", 25)),
                new Chat("Dog lovers", new User(12, "Vadim", 17)),
                new Chat("Dog lovers", new User(13, "Anton", 30)),
                new Chat("Cat lovers", new User(21, "Larisa", 45)),
                new Chat("Cat lovers", new User(22, "Galina", 46)),
                new Chat("Alien lovers", new User(31, "Eduard", 54)),
                new Chat("Alien lovers", new User(32, "Denis", 15)),
                new Chat("Ice cream lovers", new User(41, "Angela", 32)),
                new Chat("Ice cream lovers", new User(42, "Alisa", 17)),
                new Chat("Lovers of sleep", new User(51, "Nikita", 27)),
                new Chat("Lovers of sleep", new User(51, "Alexander Petrovich", 61)),
                new Chat("Lovers of sleep", new User(51, "Alyosha", 5))

        );
        System.out.println(userChatList);
        List<User> usersOver18 = filterUsersOver18(userChatList);
        System.out.println(usersOver18);
        List<User> usersUnder18 = filterUsersUnder18(userChatList);
        System.out.println(middleAge(usersUnder18));
    }


    private static List<User> filterUsersOver18(List<Chat> userChatList) {
        List<User> result = new ArrayList<>();
        for (Chat chat : userChatList) {
            if (chat.getUser().getAge() >= 18) {
                result.add(chat.getUser());
            }
        }
        return result;
    }

    private static List<User> filterUsersUnder18(List<Chat> userChatList) {
        List<User> result = new ArrayList<>();
        for (Chat chat : userChatList) {
            if (chat.getUser().getAge() < 18) {
                result.add(chat.getUser());
            }
        }
        return result;
    }


    private static double middleAge(List<User> usersUnder18) {
        ListIterator<User> iterator = usersUnder18.listIterator();
        int count = 0;
        int userCount = 0;

        while (iterator.hasNext()) {
            userCount = userCount + iterator.next().getAge();
            count++;
        }
        return (double) userCount / count;
    }
}

