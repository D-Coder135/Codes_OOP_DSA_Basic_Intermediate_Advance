/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-02-2022/02/2022
 *   Time: 09:28 PM
 *   File: WordSearch
 */

package final450DSA.strings;

public class WordSearch {
    static class Solution {
        public boolean exists(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0) && dfs(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(char[][] board, int i, int j, int count, String word) {
            if (count == word.length()) {
                return true;
            }
            if (i == -1 || i == board.length || j == -1 || j == board[0].length || board[i][j] != word.charAt(count)) {
                return false;
            }
            char temp = board[i][j];
            board[i][j] = '*';

            boolean found = dfs(board, i + 1, j, count + 1, word) || dfs(board, i - 1, j, count + 1, word)
                    || dfs(board, i, j + 1, count + 1, word) || dfs(board, i, j - 1, count + 1, word);

            board[i][j] = temp;

            return found;
        }
    }
}
