package Study_SE.JiCheng;

public class DEmo_JiCheng {

    public static void main(String[] args) {

        Father father = new Father();
        Son son = new Son();
        Son_wife son_wife = new Son_wife();
        son_wife.setName("LUCY");
        System.out.println("他俩老婆是： " + father.getWife() +"and" + son_wife.getWife());
        father.spendMoney(1_0000);
        father.Money();
        son.Money();
        son.askMoney(9_9999);





    }


}
