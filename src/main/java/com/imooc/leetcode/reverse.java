package com.imooc.leetcode;

import org.junit.Test;

public class reverse {
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
            return newInt;
        }
        System.out.println(str);
        return newInt;
    }

    @Test
    public void reverseTest() {
        int i = -153423669;
        //reverse(i);
        System.out.println(reverse(i));
    }
}
