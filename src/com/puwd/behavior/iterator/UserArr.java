package com.puwd.behavior.iterator;


import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author Administrator
 */
public class UserArr {

    private final User[] userArr;

    public UserArr() {
        this.userArr = new User[3];
        userArr[0] = new User(4,"user4",18);
        userArr[1] = new User(5,"user5",18);
        userArr[2] = new User(6,"user6",18);
    }

    public User[] getUserArr() {
        return userArr;
    }

    public MyIterator getMyIterator(){
        return new UserArrIterator();
    }

    public Iterator getJavaIterator(){
        return new UserArrJavaIterator();
    }

    private class UserArrIterator implements MyIterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < userArr.length;
        }

        @Override
        public User next() {
            User user = userArr[index];
            index++;
            return user;
        }
    }

    private class UserArrJavaIterator implements Iterator {

        private int index = 0;

        @Override
        public void forEachRemaining(Consumer action) {

        }

        @Override
        public void remove() {

        }

        @Override
        public boolean hasNext() {
            return index < userArr.length;
        }

        @Override
        public User next() {
            User user = userArr[index];
            index++;
            return user;
        }
    }
}
