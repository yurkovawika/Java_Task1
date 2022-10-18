package Lesson_1;

public class ThirdTask {
    public static void main(String[] args) {

    }
}

class Solution3 {
    public String reverseWords(String s) {
        int start = -1;
        int end = -1;
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((end == -1) && (s.charAt(i) != ' ')) {
                end = i + 1;
            }
            if ((start == -1) && (s.charAt(i) == ' ') && (end != -1)) {
                start = i + 1;
            }
            if ((i == 0) && (s.charAt(i) != ' ')) {
                start = i;
            }
            if ((end != -1) & (start != -1) & (end > start)) {
                if (res == "") {
                    res += s.substring(start, end);
                } else {
                    res += ' ' + s.substring(start, end);
                }
                start = -1;
                end = -1;
            }
        }
        return res;
    }
}