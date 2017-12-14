package com.sully.join;

/**
 * Creator: lei.s
 * Create Date: 2017年10月13日
 * 类功能描述：
 */
public class Test {
    public static void main(String[] args) {
        String a ="ABC";
        StringBuffer sb = new StringBuffer("ABC");
        if(sb.equals(a)){
            System.out.println("11");
        }
        if(a.equals(sb)){
            System.out.println("22");
        }
    }
}
