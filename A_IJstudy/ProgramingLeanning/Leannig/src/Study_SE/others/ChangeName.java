package Study_SE.others;

import java.util.Scanner;

/*
 find out what is your ancientry name is.
 */
public class ChangeName {

    static final char[] NOUN = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
            'q', 'r', 's', 't', 'w', 'x', 'y', 'z'};

    static final String[] FIRSTNAME = {"慕容", "任", "于", "厉", "柳", "钟离", "唐", "东方", "敖", "白", "南宫", "竺",
            "司徒", "尉迟", "司空", "蓝", "昭", "西门", "颜", "莫", "欧阳", "尚", "上官"};

    static final String[] SECONDNAME = {"真", "踏", "凝", "竹", "若", "雨",
            "紫", "影", "亦", "伊", "羽", "冰"};

    static final String[] THIREDNAME = {"菲", "星", "锦", "悠", "馨", "香",
            "爱", "眠", "落", "轩", "儿", "萱",
            "雪", "月", "芷若", "凌人", "绚", "痕",
            "荫", "茹", "忆", "汀", "舞", "琦",
            "汐", "熙", "郁", "心", "韵", "然",
            "默"};

    public static void main(String[] args) {
        String firstName;
        String secondName;
        String thirdName;
        int month;
        int day;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("自己姓名的第一个字母：");
        String st = sc.nextLine();
        char noun = st.charAt(0);
        System.out.println("出生的月份：");
        month = sc.nextInt() - 1;
        System.out.println("出生的日期：");
        day = sc.nextInt() - 1;
        ChangeName cn = new ChangeName();
        index = cn.findIndex(noun);
        firstName = FIRSTNAME[index];
        secondName = SECONDNAME[month];
        thirdName = THIREDNAME[day];
        System.out.print("您古代的名字是：");
        System.out.println(firstName + secondName + thirdName);
    }

    public int findIndex(char noun) {
        int index = 0;
        for (int i = 0; i < NOUN.length; i++) {
            if (NOUN[i] == noun) index = i;
        }
        return index;
    }
}



