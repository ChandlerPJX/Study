package LeetcodeDemo;

public class Demo_28 {


    /*
    给你两个字符串 haystack 和 needle ，
    请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

     */
    public static void main(String[] args) {
        Demo_28 demo_28 = new Demo_28();
        String s1 = "12345678987654321";
        String s2 = "6789";
        System.out.println(demo_28.strStr(s1, s2));

    }

    // KMP算法
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            // 逐一比较字符
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    /* 暴力解法

    public int strStr(String haystack, String needle) {
        int index = 0;
        if (haystack.length() < needle.length()) return -1;
        if(haystack == "" && needle == "") return 0;
        while (index <=(haystack.length() - needle.length())) {
            boolean falg = true;
            String str = haystack.substring(index, index + needle.length());
            if (!str.equals(needle)) {
                index++;
            }
            if(falg) return index;
        }
        return -1;
    }
     */


}
