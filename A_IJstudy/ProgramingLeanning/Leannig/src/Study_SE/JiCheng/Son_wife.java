package Study_SE.JiCheng;

public class Son_wife extends Son {

    private String name;

    public void spendMoney(int cash) {
        if (super.money > cash) {
            System.out.println("Son's wife spend :" + super.money + "on close");
            super.money -= cash;
        }else{
            System.out.println("败家玩意，钱花完了。");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
