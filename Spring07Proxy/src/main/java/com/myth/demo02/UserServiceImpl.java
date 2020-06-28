package com.myth.demo02;

/**
 * @author myth
 * @Date 2020-06-24 17:31
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("将要执行增加用户操作。。。");
        System.out.println("执行增加用户中。。。");
        System.out.println("增加用户执行完毕。。。");
    }

    public void delete() {
        System.out.println("将要执行删除用户操作。。。");
        System.out.println("执行删除用户中。。。");
        System.out.println("删除用户执行完毕。。。");
    }

    public void update() {
        System.out.println("将要执行更新用户操作。。。");
        System.out.println("执行更新用户中。。。");
        System.out.println("更新用户执行完毕。。。");
    }

    public void query() {
        System.out.println("将要执行删除用户操作。。。");
        System.out.println("执行删除用户中。。。");
        System.out.println("删除用户执行完毕。。。");
    }
}
