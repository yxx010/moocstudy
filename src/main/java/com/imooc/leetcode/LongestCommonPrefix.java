package com.imooc.leetcode;

import org.junit.Test;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String s = null;
        int len = strs.length;
        if (len == 0) {
            return prefix;
        }
        if (len == 1) {
            prefix = strs[0];
            return prefix;
        }
        int i = 0;
        while (i < strs[0].length()) {
            s = strs[0].substring(0, i + 1);
            for (int j = 1; j < len; j++) {
                if(strs[j].length()<=i){
                    return prefix;
                }

                if (!strs[j].substring(0, i + 1).equals(s)) {
                    return prefix;
                }
                if (strs[j].substring(0, i + 1).equals(s) && j == strs.length - 1) {
                    prefix = s;
                }

            }
            i++;
        }

        return prefix;

    }

    @Test
    public void testLongestCommonPrefix() {
        String[] strs = {"flower","flower","flower","flower"};
        System.out.println("最后：" + longestCommonPrefix(strs));

    }
}
