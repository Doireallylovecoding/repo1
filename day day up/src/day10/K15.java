package day10;

import java.util.Scanner;

public class K15 {
    public static void main(String[] args) {
        TV AV=new TV();
        RemoteControl cn=new RemoteControl();
        cn.controlTV(AV);
        Phone p=new Phone();
        p.connecting();
        p.controlTV(AV);

    }
}

class TV{
    String name;

    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }
    void play(String channal){
        System.out.println(name+"电视正在播放"+channal);
    }
}

interface RedRay{
    abstract void controlTV(TV tv);
     default void connecting(){
        System.out.println("外接设备,连接成功,可以使用红外线");
    }

}
class RemoteControl{
    void controlTV(TV tv){
        System.out.println("遥控器控制电视");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入节目名称:");
        String s=sc.nextLine();
        tv.name="长虹";
        tv.play(s);
    }
}

class Phone implements RedRay{
    public void controlTV(TV tv){
        System.out.println("手机开启红外功能,控制电视");
        System.out.println("请输入节目名称:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        tv.play(s);
    }
}