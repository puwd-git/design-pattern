package com.puwd.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author puwd
 */
public class ReadOnlyInvocationHandler implements InvocationHandler {

    IPerson person;

    public ReadOnlyInvocationHandler(IPerson person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){
            System.out.println("ReadOnlyInvocationHandler调用"+method.getName()+"方法");
            return method.invoke(person,args);
        } else {
            throw new RuntimeException("只能访问对象，不允许修改");
        }
    }
}
