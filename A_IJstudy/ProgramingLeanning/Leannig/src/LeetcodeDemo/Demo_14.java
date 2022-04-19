package LeetcodeDemo;

public class Demo_14 {

    public static void main(String[] args) {
        Demo_14 de14 = new Demo_14();

        String[] strs = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};


        System.out.println(de14.longestCommonPrefix(strs));
        System.out.println(de14.longestCommonPrefix(strs2));

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null) return "";
        String s;
        String str0 = strs[0];
        for (int i = 0; i < str0.length(); i++) {
            char c = str0.charAt(i);
            //按列一个字符一个字符的对比当不相同时退出
            for (int j = 0; j < strs.length; j++) {
                //同一列
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    s = str0.substring(0, i);
                    return s;
                }
            }
        }
        return str0;

    }


 /*
    public char[] longestCommonPrefix(String[] strs) {
        char[] c = new char[strs[0].length()];
        int count = 0;
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[0].charAt(j) == strs[i].charAt(j)) {
                    c[j] = strs[0].charAt(j);
                } else {
                    c[j] = ' ';
                }
            }
        }
        return c;
    }

  */
}
