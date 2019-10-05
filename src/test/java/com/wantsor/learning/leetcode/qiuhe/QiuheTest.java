package com.wantsor.learning.leetcode.qiuhe;

import com.wantsor.learning.leetcode.simple.Qiuhe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QiuheTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void should_当只有2个数且符合时返回下标0和1() {
        int[] array=new int[]{4,5,6};
        int target = 9;
        int[] result = Qiuhe.twoSum(array, target);
        assertArrayEquals(new int[]{0,1}, result);
    }
    @Test
    public void should_当只有2个数且没有符合时返回null() {
        int[] array=new int[]{4,6,7};
        int target = 9;
        int[] result = Qiuhe.twoSum(array, target);
        assertNull(result);

    }
    @Test
    public void should_当有3个数且符合时返回下表1和2() {
        int[] array=new int[]{4,6,7};
        int target = 13;
        int[] result = Qiuhe.twoSum(array, target);
        assertArrayEquals(new int[]{1,2}, result);
    }
    @Test
    public void should_当有4个数且符合时返回下表2和3() {
        int[] array=new int[]{4,6,7,8};
        int target = 15;
        int[] result = Qiuhe.twoSum(array, target);
        assertArrayEquals(new int[]{2,3}, result);
    }
    @Test
    public void should_当有相同下标符合时不能返回相同下表() {
        int[] array=new int[]{3,2,4,8};
        int target = 6;
        int[] result = Qiuhe.twoSum(array, target);
        assertArrayEquals(new int[]{1,2}, result);
    }
}