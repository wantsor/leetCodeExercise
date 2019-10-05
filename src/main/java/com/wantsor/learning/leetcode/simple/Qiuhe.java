package com.wantsor.learning.leetcode.simple;


import java.util.HashMap;
import java.util.Map;

public class Qiuhe {
    public static void main(String args[]){
    }

    /**
     * 给定一个数组， 找出里面两个整数之和等于target的数的下标
     * 假设一组输入只对应一个输出组合
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target){
        if(nums.length <2){
            return null;
        }
        for(int i=0;i<nums.length-1 ;i++){
            for(int j=i+1;j<nums.length; j++){
                if((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target){
        if(nums.length<2){
            return null;
        }
        Map<Integer, Integer> valueIndexMap = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int otherNum = target - nums[i];
            if(valueIndexMap.containsKey(otherNum)){
                return new int[]{valueIndexMap.get(otherNum),i};
            }
            valueIndexMap.put(nums[i],i);
        }
        return null;
    }
}
