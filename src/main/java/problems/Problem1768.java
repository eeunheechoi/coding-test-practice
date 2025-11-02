package problems;

/**
 * 1768. Merge Strings Alternately
 */
public class Problem1768 {

    /**
     * You are given two strings word1 and word2.
     * Merge the strings by adding letters in alternating order, starting with word1.
     * If a string is longer than the other, append the additional letters onto the end of the merged string.
     *
     * Example 1:
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     *
     *  Example 2:
     * Input: word1 = "ab", word2 = "pqrs"
     * Output: "apbqrs"
     * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
     * word1:  a   b
     * word2:    p   q   r   s
     * merged: a p b q   r   s
     *
     * Example 3:
     * Input: word1 = "abcd", word2 = "pq"
     * Output: "apbqcd"
     * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
     * word1:  a   b   c   d
     * word2:    p   q
     * merged: a p b q c   d
     *
     * @param String
     * @param String
     * @return merged string.
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int minlength = Math.min(word1.length(), word2.length());
        for(int i=0; i < minlength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if(word1.length() > minlength) {
            result.append(word1.substring(minlength));
        }
        if(word2.length() > minlength) {
            result.append(word2.substring(minlength));
        }
        return result.toString();

    }
}