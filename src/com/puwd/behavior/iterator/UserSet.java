package com.puwd.behavior.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Administrator
 */
public class UserSet {

    private final Set<User> userSet;

    public UserSet() {
        this.userSet = new HashSet<>();
        userSet.add(new User(7,"user7",18));
        userSet.add(new User(8,"user8",18));
        userSet.add(new User(9,"user9",18));
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public Iterator getJavaIterator(){
        return userSet.iterator();
    }
}
