package com.homework3;

import com.homework3.basic.User;
import com.homework3.util.UserUtil;

public class UserTest {
    public static void main(String[] args) {
        int nested = 5;
        UserUtil.printNestedUser(UserUtil.generationOfUsers(new User("Slava",(long)1342367,"Dmitrievich"),nested));
    }
}
