/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 18-02-2022/02/2022
 *   Time: 09:41 PM
 *   File: WordBreak2
 */

/**
 * LEETCODE QUESTION 140 =>
 * <p>
 * Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is
 * a valid dictionary word. Return all such possible sentences in any order.
 * <p>
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
 * Output: ["cats and dog","cat sand dog"]
 * <p>
 * Example 2:
 * <p>
 * Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
 * Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
 * Explanation: Note that you are allowed to reuse a dictionary word.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: []
 */

package final450DSA.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {
    static class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            HashSet<String> set = new HashSet<>(wordDict);
            HashMap<Integer, List<String>> map = new HashMap<>(); // For DP
//            return wordBreakHelper(s, 0, set);
            return wordBreakDp(s, 0, set, map);
        }

        // Using Recursion (Backtracking)
        private List<String> wordBreakHelper(String s, int start, HashSet<String> set) {
            List<String> validSubStr = new ArrayList<>();

            if (start == s.length()) {
                validSubStr.add("");
            }
            for (int end = start + 1; end <= s.length(); end++) {
                String prefix = s.substring(start, end);
                if (set.contains(prefix)) {
                    List<String> suffixes = wordBreakHelper(s, end, set);

                    for (String suffix : suffixes) {
                        validSubStr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                    }
                }
            }
            return validSubStr;
        }

        // Using DP (More Optimized Solution)
        private List<String> wordBreakDp(String s, int start, HashSet<String> set, HashMap<Integer, List<String>> map) {
            List<String> validSubStr = new ArrayList<>();


            if (start == s.length()) {
                validSubStr.add("");
            }

            if (map.containsKey(start)) {
                return map.get(start);
            }
            for (int end = start + 1; end <= s.length(); end++) {
                String prefix = s.substring(start, end);
                if (set.contains(prefix)) {
                    List<String> suffixes = wordBreakDp(s, end, set, map);

                    for (String suffix : suffixes) {
                        validSubStr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                    }
                }
            }
            map.put(start, validSubStr);
            return validSubStr;
        }
    }
}
