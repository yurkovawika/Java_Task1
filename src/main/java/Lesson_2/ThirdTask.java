package Lesson_2;

public class ThirdTask {
    public static void main(String[] args) {

    }
    class Solution {
        public int climbStairs(int n) {
            if(n == 0) return 1;
            if(n < 0) return 0;
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
