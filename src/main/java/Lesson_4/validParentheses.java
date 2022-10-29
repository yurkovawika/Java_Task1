package Lesson_4;

import java.util.Stack;

public class validParentheses {
    static Stack<Character> input;


    public static void main(String[] args) {
        String s = "(()[]){)";
        char[] ch = s.toCharArray();
        input = new Stack<>();
        System.out.println(MyStack(ch));
    }

    public static boolean MyStack(char[] ch) {
        if (ch.length == 1) {
            return false;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                input.push(ch[i]);
            } else {
                if ((!input.isEmpty()) && (input.peek() == '(' && ch[i] == ')'
                        || input.peek() == '[' && ch[i] == ']'
                        || input.peek() == '{' && ch[i] == '}')) {
                    input.pop();
                } else {
                    return false;
                }
            }
        }
        return input.isEmpty();
    }
}
