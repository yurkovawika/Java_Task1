package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Equation {
    static int count = 0;

    public static void main(String[] args) {

        Solution sol = new Solution();
        String str = "   2?  + ??  = 69";
        str = str.replace(" ", "").replace("+", "=");
        char[] chars = str.toCharArray(); // убираем пробелы и заменяем "+" на "="

        List<Integer> ints = saveIndexChar(chars); //запоминаем позиции "?"
        List<List<Integer>> list = sol.combine(9, ints.size());

        for (int i = 0; i < list.size(); i++) {
            itReplaceschar(list.get(i), ints, chars, str);

        }
        if (count < 1) {
            System.out.println("Нет решений");
        }
    }

    public static void itReplaceschar(List<Integer> list, List<Integer> ints, char[] chars, String str) {
        String str_res = "";
        for (int i = 0; i < ints.size(); i++) {
            chars[ints.get(i)] = (char) ((list.get(i)) + '0');
        }
        String[] Str3 = str.copyValueOf(chars).split("=");

        if (sumArray(Str3) == Integer.parseInt(Str3[Str3.length - 1])) {
            str_res = "Правильный вариант c комбинациями: ";
            for (int i = 0; i < Str3.length - 1; i++) {
                str_res += Str3[i] + " ";
            }
            System.out.println(str_res);
            count++;
        }

    }


    public static String toString(char[] a)//преобразование массива символов в строку
    {
        // Creating object of String class
        String string = new String(a);
        return string;
    }

    public static int sumArray(String[] Str) {
        int sum = 0;
        for (int i = 0; i < Str.length - 1; i++) {
            sum = sum + Integer.parseInt(Str[i]);
        }
        return sum;
    }

    public static List<Integer> saveIndexChar(char[] chars) {//запоминаем позиции "?"
        List<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '?') {
                ints.add(i);
            }
        }
        return ints;
    }
}

class Solution {
    public List<List<Integer>> combine(int n, int k) { //n - до какого числа комбианции(до 9), k - размер комбианции( напр 2 = кол-ву "?")
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (n <= 0)
            return result;
        ArrayList<Integer> current = new ArrayList<Integer>();
        dfs(n, k, current, result); //
        return result;
    }

    private void dfs(int n, int k, ArrayList<Integer> current, List<List<Integer>> res) {
        if (current.size() == k) {
//            System.out.println(current);// у нас есть комбинация
            int a = current.get(0);
            int b = current.get(1);

            res.add(new ArrayList<Integer>(current));

            return;
        }
        for (int i = 0; i <= n; i++) {
            current.add(i);
            dfs(n, k, current, res);
            current.remove(current.size() - 1);
        }
    }
}
