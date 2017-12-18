package ycz.sample;

import org.testng.annotations.Test;

@Test
public class JbasicTest {

    public void testBinary() {
        Integer i = 100;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(1.0/0.0);//Infinity
        System.out.println(-1.0/0.0);//-Infinity
        System.out.println(Math.sqrt(-1.0));//NaN
    }
}
