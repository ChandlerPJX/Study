package LeetcodeDemo;

import java.util.Scanner;

/*
    给你两个二进制字符串，返回它们的和（用二进制表示）。

    输入为 非空 字符串且只包含数字 1 和 0。

 */
public class Demo_67 {
    public static void main(String[] args) {
        Demo_67 demo_67 = new Demo_67();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(demo_67.addBinary_4(a, b));
        scanner.close();
    }

    private String addBinary_1(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int len = Math.max(a.length(), b.length());
        int carry = 0; // 表示进位， 即上一次计算是否有进位产生
        for (int i = 0; i < len; i++) {
            /*  解释 i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0
                当 i < a.length() 取 a.charAt(a.length() - 1 - i) - '0' 的数值
                    a.charAt(a.length() - 1 - i) 逆序列的取 a.chatAt()的数
                    其中的数值为'0'  or '1' 因此 a.charAt(a.length() - 1 - i) - '0' 的数值要么为 1， 要么为 0。
                    '1' - '0' = 1
                    '0' - '0' = 0

                当 i < a.length() 取 0
             */
            carry = carry + i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry = carry + i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            // 把计算的结果添加到 ans中 ps： 这时候的添加顺序为逆序的，输出的时候要reverse一下。
            ans.append((char)(carry % 2 + '0')); // 由于 carry 与 '0' 参与加法运算都是ASCII， 所以要记得转换为char类型
            carry /= 2;
        }
        // 判断最后是否产生了进位，如果有的话就加'1'
        if(carry > 0){
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }

    public String addBinary_3(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(), b.length());
        int carry = 0;
        for (int i = 0; i < n; ++i) {

            carry = carry + i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry = carry + i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }


    public String addBinary_4(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int ca = 0; //是否进一位
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            // 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            sum += (i >= 0 ? a.charAt(i) - '0' : 0);

            // 获取字符串a对应的某一位的值 当i<0是 sum+=0（向前补0） 否则取原值 ‘1’的char类型和‘0’的char类型刚好相差为1
            sum += (j >= 0 ? b.charAt(j) - '0' : 0);
            ans.append(sum % 2);  //如果二者都为1  那么sum%2应该刚好为0 否则为1
            ca = sum / 2;   //如果二者都为1  那么ca 应该刚好为1 否则为0
        }
        ans.append(ca == 1 ? ca : "");// 判断最后一次计算是否有进位  有则在最前面加上1 否则原样输出
        return ans.reverse().toString();
    }

}
