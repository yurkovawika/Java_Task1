package Lesson_1;

public class FirstTask {
    public static void main(String[] args) {

    }
}

class Solution1 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i >= 0) {
                ans[i] = nums[nums[i]];
            }
        }
        return ans;
    }
}
