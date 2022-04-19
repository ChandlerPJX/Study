package Study_SE.JiCheng;

public class Father {

    int money = 10_0000;

    String house = "一千平米大豪宅";

    private String wife = "lili";

    public String getWife() {
        return wife;
    }

    public void Money() {
        if (this.money > 0) {
            System.out.println("F-现有：" + this.money);
        } else {
            System.out.println("破产了，没钱啦！");
        }
    }

    public void spendMoney(int spend) {
        System.out.println("随随便便花了：" + spend);
        this.money = this.money - spend;
    }

    public void earnMoney(int cash) {
        System.out.println("赚了:" + cash);
        this.money = this.money + cash;
    }

    public int giveMoney(int gm) {
        this.money = this.money - gm;
        System.out.println("给了儿子" + gm + "块");
        return gm;
    }

}