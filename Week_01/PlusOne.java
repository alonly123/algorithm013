package com.alonly.leecode.algorithm.week01;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        // 第二遍
        // 1. 判空
        // 2. 遍历数组（倒序）
        // 3. 对 + 1后的值，除以10取模
        if (digits == null || digits.length <= 0) {
            return null;
        }
        int plusOneModVal = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i] + plusOneModVal;
            plusOneModVal = value / 10;
            // 等于0  说明小于 10，不需要进 1
            if (plusOneModVal == 0) {
                digits[i] = value;
                return digits;
            } else {
                // 第二遍写时， 这个赋值为0 忘记了，基本上都写出来了
                digits[i] = 0;
            }
        }
        if (plusOneModVal == 1) {
            // 说明 是类似： 999这种情况，最大位数的值也进1
            // 数组长度+1，变成： 1,0,0,0
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
