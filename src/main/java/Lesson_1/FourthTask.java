package Lesson_1;

public class FourthTask {
    public static void main(String[] args) {

    }
}
class Solution4 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l += 1;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r -= 1;
            }
            char lchar = Character.toLowerCase((s.charAt(l)));
            char rchar = Character.toLowerCase((s.charAt(r)));
            if (lchar != rchar) {
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }
}