package arraystring;

/**
 * 1071. Greatest Common Divisor of Strings
 */
public class Problem1071 {
    /**
     * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
     *
     * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
     *
     * Example 1:
     * Input: str1 = "ABCABC", str2 = "ABC"
     * Output: "ABC"
     *
     * Example 2:
     * Input: str1 = "ABABAB", str2 = "ABAB"
     * Output: "AB"
     *
     * Example 3:
     * Input: str1 = "LEET", str2 = "CODE"
     * Output: ""
     *
     * @param String
     * @param String
     * @return merged string.
     */
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int gcr = gcr(str1.length(), str2.length());
        String result = str1.substring(0, gcr);
        return result;
    }

    public int gcr(int num1, int num2) {
        if(num2 == 0) return num1;

        return gcr(num2, num1%num2);
    }
}
