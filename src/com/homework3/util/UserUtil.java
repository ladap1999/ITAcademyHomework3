package com.homework3.util;

import com.homework3.basic.User;
import com.homework3.UserTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class UserUtil {

    public static User generationOfUsers(User user, int nested) {
        Random random = new Random();
        String[] names = new String[]{"Ivan", "Petr", "Svetlana", "Kristina", "Ryslan", "Tom", "Maria", "Fedr", "Valentin", "Olga"};
        String[] surnames = new String[]{"Ivanov", "Popov", "Sedorov", "Kulesh", "Rubin", "Teshkevich", "Malech", "Fedorov", "Valevach", "Orlov"};
        Long[] id = new Long[]{(long) 112226, (long) 4511, (long) 6712, (long) 5912, (long) 5932, (long) 6211, (long) 8123, (long) 3233, (long) 3467};

        if (nested >= 0) {
            List<User> userFriends = new ArrayList<>();
            User friendOfUser = new User(names[random.nextInt(names.length)], id[random.nextInt(id.length)], surnames[random.nextInt(surnames.length)]);
            userFriends.add(friendOfUser);
            user.setFriends(userFriends);

            generationOfUsers(friendOfUser, nested - 1);
        }
        return user;
    }

    public static void printNestedUser(User user){
        System.out.print(user.getName() + " -> ");
        if (user.getFriends()!= null) {
            List<User> usersFriend = user.getFriends();
            for (User element: usersFriend ) {
                System.out.println(element.getName());

                printNestedUser(element);
            }
        } else {
                System.out.println("No friends");
            }
        }
}