import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    /*
     * 49. Group Anagrams
     * Difficulty: Medium
     * Topics: Array, Hash Table, String, Sorting
     */
    public List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word: strs) {
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);
            String sortedWord = new String(charWord);

            if (!anagramMap.containsKey(sortedWord)) {
               anagramMap.put(sortedWord, new ArrayList<>());
            }

            anagramMap.get(sortedWord).add(word);
        }

        return anagramMap.values().stream().toList();
    }
}
