/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06-02-2022/02/2022
 *   Time: 10:50 PM
 *   File: Rotation
 */

/**
 * Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
 * (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
 */

package final450DSA.strings;

public class Rotation {
    static boolean areRoations(String str1, String str2) {
        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (areRoations(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
