package LeetcodeDemo;

import java.sql.SQLData;
import java.util.*;

public class Demo_20 {

    public static void main(String[] args) {
        String s = "()";
        Demo_20 de = new Demo_20();

        System.out.println(de.isValid(s));
    }

    private boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;
        //按照（k,v）存储数据
        Map map = new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 如果 k 存在
            if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            }else {
                // 如果不是key 说明是左边括号，入栈
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
/* stack.pop 与 stack.peek 的区别
相同点：大家都返回栈顶的值。
不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
 */

    // 不用map 但是却很麻烦。
//    public boolean isValid(String s) {
//        //字符长度不是偶数
//        if (s.length() % 2 != 0) return false;
//        Stack<Character> stack = new Stack<>();
//        char c[] = s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            // 如果是左括号就进栈
//            if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
//                stack.push(c[i]);
//            } else {
//                //是右括号，而且不是空栈
//                if (!stack.empty()) {
//                    if (c[i] == ')') {
//                        if (stack.pop() != '(') return false;
//                    } else if (c[i] == ']') {
//                        if (stack.pop() != '[') return false;
//                    } else {
//                        if (stack.pop() != '{') return false;
//                    }
//                } else {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
}
