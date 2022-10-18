package Lesson_1;

public class SecondTask {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] != val) {
                nums[copyInd++] = nums[i];
            }
        }
        return copyInd;
    }
}
