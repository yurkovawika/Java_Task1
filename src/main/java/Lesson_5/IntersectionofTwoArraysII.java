package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num1 : nums1) {
            map.putIfAbsent(num1, 0);
            map.put(num1, map.get(num1) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int num2 : nums2) {
            if (map.containsKey(num2) && map.get(num2) > 0) {
                list.add(num2);
                map.put(num2, map.get(num2) - 1);
            }
        }

        int res[] = new int[list.size()];
        int i = 0;
        for (int lst : list) {
            res[i++] = lst;
        }
        return res;
    }

}
