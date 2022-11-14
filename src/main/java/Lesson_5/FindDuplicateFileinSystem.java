package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileinSystem {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        findDuplicate(paths);
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < paths.length; i++) {
            String[] nums = paths[i].split(" ");
            String dir = nums[0];
            for (int j = 1; j < nums.length; j++) {
                String num = nums[j];
                String content = num.substring(num.indexOf('(') + 1, num.indexOf(')'));
                String e = dir + "/" + num.substring(0, num.indexOf('('));
                if (map.containsKey(content)) {
                    map.get(content).add(e);
                } else {
                    List<String> values = new ArrayList<>();
                    values.add(e);
                    map.put(content, values);
                }
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            if (list.size() > 1) {
                result.add(map.get(key));
            }
        }
        return result;
    }
}
