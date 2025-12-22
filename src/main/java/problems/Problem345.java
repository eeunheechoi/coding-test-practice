package problems;

/**
 * 345. Reverse Vowels of a String
 */
public class Problem345 {
    /**
     * Given a string s, reverse only all the vowels in the string and return it.
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     *
     * Example 1:
     * Input: s = "IceCreAm"
     * Output: "AceCreIm"
     * Explanation:
     * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
     *
     * Example 2:
     * Input: s = "leetcode"
     * Output: "leotcede"
     *
     * Constraints:
     * 1 <= s.length <= 3 * 105
     * s consist of printable ASCII characters.
     */

    public String reverseVowels(String s) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length -1;

        while (left < right) {
            while(left < right && !isVowel(chars[left])) left++;
            while(left < right && !isVowel(chars[right])) right--;
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
