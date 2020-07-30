package com.alonly.leecode.algorithm.week01;
// https://leetcode-cn.com/problems/move-zeroes/

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 670 👎 0

import java.util.Arrays;

public class MoveZeroes {
    /**
     * 20200730， 看题第一思路，是把0 往右移动，非0往左移动，
     * 想到之前做冒泡排序时的方式，有点类似，冒泡是比大小，这里是判断值是否为0
     * 具体的实现方案，最后还是参考了leecode
     * 时间复杂度：遍历了数组中n个元素，所以是O(n);
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        // 遍历数组， 将 非0值 与 0 替换位置
        int j = 0;
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{1, 0, 3, 0, 1, 0, 3, 12, 0});
    }
}
