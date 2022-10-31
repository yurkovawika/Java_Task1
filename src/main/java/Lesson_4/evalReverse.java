package Lesson_4;

import java.util.Stack;

public class evalReverse {
    static Stack<Integer> res;

    public static void main(String[] args) {

        String[] tokens = {"4", "-2", "/", "2", "-3", "-", "-"};
        res = new Stack<>();
        System.out.println(MyStack(tokens, 0));
    }

    public static int MyStack(String[] tokens, int temp) {
        for (int i = 0; i < tokens.length; i++) {
            if (isDigit(tokens[i])) {
                res.push(Convert(tokens[i]));
            } else {
                switch (tokens[i]) {
                    case "+":
                        temp = res.pop() + res.pop();
                        res.push(temp);
                        break;
                    case "-":
                        temp = res.pop();
                        temp = res.pop() - temp;
                        res.push(temp);
                        break;
                    case "*":
                        temp = res.pop() * res.pop();
                        res.push(temp);
                        break;
                    case "/":
                        temp = res.pop();
                        temp = res.pop() / temp;
                        res.push(temp);
                        break;
                    default:
                        break;
                }
            }
        }
        return res.peek();
    }

    public static boolean isDigit(String str) {
        boolean isNum = str.chars().anyMatch(Character::isDigit);
        return isNum;
    }

    public static int Convert(String str) {
        int num = Integer.parseInt(str);
        return num;
    }

}
