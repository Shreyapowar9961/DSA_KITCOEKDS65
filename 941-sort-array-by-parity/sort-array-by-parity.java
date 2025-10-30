class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                // Swap: even to left, odd to right
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) left++;   // Move left pointer for even numbers
            if (nums[right] % 2 == 1) right--; // Move right pointer for odd numbers
        }

        return nums;
    }
}
