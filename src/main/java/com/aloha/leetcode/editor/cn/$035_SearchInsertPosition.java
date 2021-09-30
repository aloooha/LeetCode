/*
 * Copyright (c) 2021. All rights reserved.
 * @LeetCode Question: 搜索插入位置
 * @Author: chulei
 * @Date: 2021/9/27 上午12:12
 */

package com.aloha.leetcode.editor.cn;


public class $035_SearchInsertPosition{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1,3}, 2));
    }
    static
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length;
            int mid = 0;
            while (left<right) {
                mid = left + (right - left)/2;
                if(nums[mid]<target) {
                    left = mid+1;
                } else if (nums[mid]>target) {
                    // 注意：即使target小于num[mid]，结果也不能排除mid, 因此mid不能-1
                    // 不减，循环为什么能停下来？
                    // 1. 循环条件是left<right;
                    // 2.right仍然再缩。mid<=right, 取等的条件是left=rgiht
                    right = mid;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}





//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums 为无重复元素的升序排列数组 
// -10⁴ <= target <= 10⁴ 
// 
// Related Topics 数组 二分查找 👍 1101 👎 0
