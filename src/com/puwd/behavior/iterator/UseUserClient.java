package com.puwd.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Administrator
 */
public class UseUserClient {

    private UserList userList;

    private UserArr userArr;

    private UserSet userSet;

    public UseUserClient() {
        this.userList = new UserList();
        this.userArr = new UserArr();
        this.userSet = new UserSet();
    }

    public void getAllUser(){

        // 第一版
        printUserList();
        printUserArr();

        // 第二版
        MyIterator iterator1 = userList.getMyIterator();
        MyIterator iterator2 = userArr.getMyIterator();
        getAllUser(iterator1);
        getAllUser(iterator2);

        // 第三版
        Iterator iterator3 = userList.getJavaIterator();
        Iterator iterator4 = userArr.getJavaIterator();
        Iterator iterator5 = userSet.getJavaIterator();
        getAllUser(iterator3);
        getAllUser(iterator4);
        getAllUser(iterator5);
    }

    // ===============================第一版 有多少种集合就需要写多少种遍历方法 会使用内部的元素=====================================

    private void printUserList() {
        List<User> userList1 = userList.getUserList();
        for (int i = 0; i < userList1.size(); i++) {
            System.out.println("printUserList"+userList1.get(0));
        }
    }

    private void printUserArr() {
        User[] userArr1 = userArr.getUserArr();
        for (int i = 0; i < userArr1.length; i++) {
            System.out.println("printUserArr"+userArr1[0]);
        }
    }

    // ===============================第二版 使用自定义迭代器接口，1种遍历方法 不会使用内部的元素=====================================

    private void getAllUser(MyIterator iterator){
        while (iterator.hasNext()) {
            System.out.println("MyIterator"+iterator.next());
        }
    }

    // ===============================第三版 使用Java迭代器接口，1种遍历方法 不会使用内部的元素=====================================

    private void getAllUser(Iterator iterator){
        while (iterator.hasNext()) {
            System.out.println("JavaIterator"+iterator.next());
        }
    }
}
