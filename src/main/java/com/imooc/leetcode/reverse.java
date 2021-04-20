package com.imooc.leetcode;

import org.junit.Test;

public class reverse {
    //方法一：
    public int reverse(int x) {
        int newInt = 0;
        StringBuffer stringBuffer = new StringBuffer(Integer.toString(x)).reverse();
        String str = stringBuffer.toString();
        if (str.endsWith("-")) {
            str = str.replace("-", "");
            str = "-" + str;
        }
        try {
            newInt = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("反转后超出int存储范围，返回0");
            return newInt;
        }
        System.out.println(str);
        return newInt;
    }

    //方法二
    public int reverse1(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (res * 10L > Integer.MAX_VALUE || res * 10L + pop > Integer.MAX_VALUE) return 0;
            if (res * 10L < Integer.MIN_VALUE || res * 10L + pop < Integer.MIN_VALUE) return 0;
            res = res * 10 + pop;
        }
        return res;
    }

    //方法三 官方解法
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    //方法四
    public int reverse4(int x) {
        long res = 0;
        while (x != 0) {
            int pop = x % 10;
            res = res * 10 + pop;
            x = x / 10;
        }
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        return (int) res;
    }

    @Test
    public void reverseTest() {
        int i = -1534236699;
        //reverse(i);
        System.out.println(reverse(i));
        System.out.println(reverse1(i));
        System.out.println(reverse2(i));
        System.out.println(reverse4(i));
    }
}
