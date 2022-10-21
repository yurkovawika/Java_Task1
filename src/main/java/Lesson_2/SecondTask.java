package Lesson_2;

public class SecondTask {
    public static void main(String[] args) {

    }
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 1) {
                return true;
            } else if (n == 0) {
                return false;
            } else if (n % 2 != 0) {
                return false;
            }
            return isPowerOfTwo(n / 2);
        }
    }

}
