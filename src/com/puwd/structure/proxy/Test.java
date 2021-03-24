package com.puwd.structure.proxy;



import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        IPerson person = new Person("蒲卫东", 28, 0, "成都市");
        ReadOnlyInvocationHandler readOnlyInvocationHandler = new ReadOnlyInvocationHandler(person);
        ReadWriteInvocationHandler readWriteInvocationHandler = new ReadWriteInvocationHandler(person);

        IPerson personProxy = (IPerson) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), readOnlyInvocationHandler);

        System.out.println(personProxy.getAddress());
        System.out.println(personProxy.getName());
        System.out.println(personProxy.getSex());
        //personProxy.setAddress("123123");

        personProxy = (IPerson) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), readWriteInvocationHandler);

        personProxy.setAddress("北京");
        personProxy.setName("大王");
        personProxy.setSex(1);
        System.out.println(personProxy.getAddress());
        System.out.println(personProxy.getName());
        System.out.println(personProxy.getSex());

    }
}
