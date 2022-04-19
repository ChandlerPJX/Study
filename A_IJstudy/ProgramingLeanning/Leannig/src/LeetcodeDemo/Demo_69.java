package LeetcodeDemo;

public class Demo_69 {


    public static void main(String[] args) {
        int x = 8;
        int a = new Demo_69().mySqrt(x);
        System.out.println(a);
    }

    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
