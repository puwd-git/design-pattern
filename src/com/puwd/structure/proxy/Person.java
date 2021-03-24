package com.puwd.structure.proxy;


/**
 * @author puwd
 */
public class Person implements IPerson {

    private String name;

    private int age;

    private int sex;

    private String address;

    public Person(String name, int age, int sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getSex() {
        return sex;
    }

    @Override
    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
