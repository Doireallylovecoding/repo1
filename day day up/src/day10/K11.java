package day10;

import javax.naming.Name;
import java.sql.SQLOutput;

public class K11 {
    public static void main(String[] args) {
        MobileGame G1=new MobileGame();
        G1.setName("王者荣耀");
        G1.setType("竞技");

        G1.play();
        G1.prepare();

    }
}
abstract class  Game{
    String type;
    String name;
    abstract void play();

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class MobileGame extends Game{

    private void efforts(){
//        MobileGame G=new MobileGame();
        System.out.println("晚上不睡觉玩"+getName());
    }
    private void damage(){
        System.out.println("导致白天上课困,毕业后找不到工作");
    }
    @Override
    void play(){
//        MobileGame G=new MobileGame();
        System.out.println("名称为"+getName()+"的"+getType()+"类游戏非常流行");
    }
    void prepare(){
        efforts();
        damage();
    }
}


