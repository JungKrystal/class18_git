package com.bjpowernode;

/**
 * @author wangjunchen
 */
public class Demo {
    public static Demo demo = new Demo();

    public void Hello() {
        System.out.println("Hello World");
    }

    public Integer sum(int a, int b) {
        return a + b;
    }

    public Integer mul(int a, int b) {
        return demo.sum(a, b) * a * b;
    }
}
