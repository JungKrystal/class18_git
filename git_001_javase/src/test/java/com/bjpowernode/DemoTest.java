package com.bjpowernode;

import org.junit.Test;

/**
 * @author wangjunchen
 */
public class DemoTest {
    public Demo demo = new Demo();

    @Test
    public void testHello() {
        demo.Hello();
    }

    @Test
    public void testSum() {
        System.out.println(demo.sum(12, 13));
    }

    @Test
    public void testMul() {
        System.out.println(demo.mul(12, 13));
    }

}
