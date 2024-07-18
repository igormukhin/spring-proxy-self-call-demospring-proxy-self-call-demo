package org.demo.spring.proxyselfcall.case3;


import org.demo.spring.proxyselfcall.logaround.LogAround;
import org.springframework.stereotype.Service;

@Service
public class Case3ServiceImpl implements Case3Service {

    public void callSibling() {
        doSomething();
    }

    @LogAround("case3 log")
    public void doSomething() {
        System.out.println("case3: doing something...");
    }

}
