package Lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String [] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String [] words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(words1,words2));

    }
    public static int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length){
            return countWords(words2, words1);
        }
        Map<String, Integer> map = new HashMap<>();

        for (String word: words1) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        List<String> list = new ArrayList<>();
        for(String word : words2){
            if(!list.contains(word) && map.containsKey(word) && map.get(word) < 2){
                list.add(word);
            }
            else{
                list.remove(word);
                map.remove(word);
            }
        }
        return list.size();
    }
}
