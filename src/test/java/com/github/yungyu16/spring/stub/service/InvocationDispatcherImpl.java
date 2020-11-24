package com.github.yungyu16.spring.stub.service;

import com.github.yungyu16.spring.stub.AbstractInvocationDispatcher;
import com.github.yungyu16.spring.stub.annotation.TestClient;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * CreatedDate: 2020/11/24
 * Author: songjialin
 */
@Component
public class InvocationDispatcherImpl extends AbstractInvocationDispatcher<TestClient> {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args, TestClient annotation) throws Throwable {
        System.out.println(annotation);
        System.out.println("hahahahhhhhhhhhhhhhhhhhhhhhhhhhh");
        System.out.println("hahahahhhhhhhhhhhhhhhhhhhhhhhhhh");
        return null;
    }
}
