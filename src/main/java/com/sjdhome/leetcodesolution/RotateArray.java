package com.sjdhome.leetcodesolution;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == 1) return;
        rotate(nums, 0, k);
    }

    public void rotate(int[] nums, int start, int k) {
        if (nums.length - start <= k) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int temp = nums[start + i];
            nums[start + i] = nums[nums.length - k + i];
            nums[nums.length - k + i] = temp;
        }
        rotate(nums, start + k, k);
    }
}
