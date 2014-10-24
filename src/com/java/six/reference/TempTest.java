package com.java.six.reference;

public class TempTest {
    private void test(User user) {
        user = new User();//新加的一行
        user.setAge(20);
        System.out.println("test方法中的age=" + user.getAge());
    }

    public static void main(String[] args) {
        TempTest t = new TempTest();
        User a = new User();
        a.setAge(10);
        t.test(a);
        System.out.println("main方法中的age=" + a.getAge());
    }
}
