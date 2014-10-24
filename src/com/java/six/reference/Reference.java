package com.java.six.reference;

/**
 * Created by test on 2014/10/24.
 */
public class Reference {

    public static void main(String[] args) {
        int age = 20;
        System.out.println("init------"+age);
        changeInt(age);
        System.out.println("changeInt------"+age);
        User user = new User();
        user.setAge(age);
        user.setName("test");
        System.out.println("user_init------"+user.getAge() + "-----" + user.getName());
        changeUser(user);
        System.out.println("user_change------"+user.getAge() + "-----" + user.getName());

    }

    private static void changeInt(int age){
        age = 0;
    }

    private static void changeUser(User user){
        user.setName("aaron");
        user.setAge(10);
        changeInt(user.getAge());
    }
}
