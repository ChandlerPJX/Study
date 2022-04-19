package Study_SE.JiCheng;

public class Son extends Father {

    int money = 0;


    public void Money(){
        System.out.println("Son 现有：" + this.money);
    }


    public int askMoney(int money) {
        if(super.money > money){
            System.out.println("Son要了：" + money);
            this.money = this.money + money;
            return money;
        }else {
            System.out.println("没钱了！");
            return  -1;
        }
    }

    @Override
    public void earnMoney(int cash) {
        System.out.println("小赚500");
        this.money = this.money + cash;

    }

    @Override
    public void spendMoney(int spend) {
        System.out.println("花了2000");
        this.money = this.money - spend;
    }




}
