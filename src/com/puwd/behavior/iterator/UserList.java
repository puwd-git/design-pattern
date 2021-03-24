package com.puwd.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Administrator
 */
public class UserList {

    private final List<User> userList;

    public UserList() {
        this.userList = new ArrayList<>();
        userList.add(new User(1,"user1",18));
        userList.add(new User(2,"user2",18));
        userList.add(new User(3,"user3",18));
    }

    public List<User> getUserList() {
        return userList;
    }

    public MyIterator getMyIterator(){
        return new UserListIterator();
    }

    public Iterator getJavaIterator(){
        return userList.iterator();
    }

    private class UserListIterator implements MyIterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < userList.size();
        }

        @Override
        public Object next() {
            User user = userList.get(index);
            index++;
            return user;
        }
    }
}
