package io.github.pippala.map.hashmap;

import org.junit.Test;

import java.util.HashMap;

/**
 *
 */
public class TestHashMap {

    public void test01() {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("aa", "1");
    }







    /*******************************************位运算****************************/
    /**
     * 与 and &
     * 两个操作数都为1结果为1，否则为0
     */
    @Test
    public void testAnd(){
        int a = 129;
        int b = 128;
        //10000001
        System.out.println(Integer.toBinaryString(a));
        //10000000
        System.out.println(Integer.toBinaryString(b));
        //与运算的结果为10000000 转为十进制就为128
        System.out.println(Integer.valueOf("10000000",2));
        //验证
        System.out.println(a&b);
    }

    /**
     * 或 or |
     * 两个位只要有一个为1，则结果为1，否则为0
     */
    @Test
    public void testOr(){
        int a = 129;
        int b = 128;
        //10000001
        System.out.println(Integer.toBinaryString(a));
        //10000000
        System.out.println(Integer.toBinaryString(b));
        //或运算的结果为10000001 转为十进制就为129
        System.out.println(Integer.valueOf("10000001",2));
        //验证
        System.out.println(a|b);
    }

    /**
     * 非 not ~
     * 如果位为1，结果为0，位为0，结果为1
     */
    @Test
    public void testNot(){
        int a = 2;
        //二进制位10
        System.out.println(Integer.toBinaryString(a));
        //进行非运算的结果为01，转为十进制为1
        System.out.println(Integer.valueOf("01",2));

        //验证
        System.out.println(~a);
    }


}
