package com.puwd.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author puwd
 */
public class ReadWriteInvocationHandler implements InvocationHandler {

    IPerson person;

    public ReadWriteInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ReadOnlyInvocationHandler调用"+method.getName()+"方法");
        return method.invoke(person,args);
    }
}
