package day10;

import java.util.ArrayList;
import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        Qunzhu qz = new Qunzhu("王思聪",100);
        ArrayList<Integer> al = qz.send(20,3);//发多少钱,发多少个,al,把al集合带到main方法传入到普通方法,抢红包,随机其中一个元素,al=al;

        if (al==null){
            System.out.println("余额不足不能发红包");
            return;
        }

        Diaosi ds = new Diaosi("one",0);
        ds.get(al);

        Diaosi ds2 = new Diaosi("two",0);
        ds2.get(al);

        Diaosi ds3 = new Diaosi("three",10);
        ds3.get(al);

        qz.show();
        ds.show();
        ds2.show();
        ds3.show();
    }
}

class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //看看谁有多少钱,m
    public void show() {
        System.out.println(name+"有多少钱:"+money);
    }
}

class Qunzhu extends User{
    public Qunzhu() {
    }

    public Qunzhu(String name, int money) {
        super(name, money);
    }

    //发红包,m,20元,怎么发,6,6,6+2;//发多少钱money=20,发多少个count=3;//668,搞个红包集合装起来,把集合带到main方法传入到普通方法,抢红包,随机其中一个元素
    public ArrayList<Integer> send(int money,int count) {
        ArrayList<Integer> al = new ArrayList();//空,6,6,8

        if (money>getMoney()){
            return null;
        }

        int avg = money/count;//6
        int mod = money%count;//2

        for (int i = 1; i <= count-1; i++) {//count-1=2;
            al.add(6);
        }

        //最后一个红包给最后一个人最小的儿子
        al.add(avg+mod);//8
        //this=qz群主减钱,得到总的钱减去发的钱,给钱重新赋值!!!扣钱
        int lost = this.getMoney()-money;//80
        this.setMoney(lost);

        //把al集合带到main方法传入到普通方法,抢红包,随机其中一个元素
        return al;
    }
}

class Diaosi extends User{
    public Diaosi() {
    }

    public Diaosi(String name, int money) {
        super(name, money);
    }

    //抢红包,m
    public void get(ArrayList<Integer> al) {//al红包集合,能够解释类名作为参数和返回值类型,抢红包,随机其中一个元素(随机索引,0=6,1=6,2=8)
        Random r = new Random();
        int index = r.nextInt(al.size());//index,0,1,2
        //调用通过索引拿到钱,同时移除这个红包集合里面的钱!!!,移除元素钱并且返回间接删 钱 remove(index)
        int money = al.remove(index);//抢到的钱money,重新设置赋值屌丝的钱,增加,this=ds;
        this.setMoney(this.getMoney()+money);
    }
}

