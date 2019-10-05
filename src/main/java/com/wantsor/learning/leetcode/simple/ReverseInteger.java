package com.wantsor.learning.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    public static void main(String args[]){
    }

    public static int reverse(int x){
        // 小于10且大于-10不用交换了
        if(x>-10 && x<10){
            return x;
        }
        boolean isMinus=false;
        // 处理负数
        if(x<0){
            x = Math.abs(x);
            isMinus = true;
        }

        StringBuilder resultStr = new StringBuilder();
        while(x >= 10){
            int mod = x%10;
            resultStr.append(mod);
            x = x/10;
        }
        // 剩下的原来最高位加到最后
        resultStr.append(x);
        String result = resultStr.toString();
        if(resultStr.length() == 10 && result.compareTo("2147483648") > 0){
            return 0;
        }
        result = !isMinus ? result : "-"+result;
        return Integer.parseInt(result);
    }
}
