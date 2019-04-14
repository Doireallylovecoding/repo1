package day10;

import javax.swing.*;

public class K14 {
    public static void main(String[] args) {
        Man K=new Man();
        K.country="好望角";
        K.name="彭于晏";
        K.life();


    }
}

abstract class People{
    String name;
    String country;
    abstract void speak(String str);
}

interface Movement{
    abstract void exercise();
}

class Man extends People implements Movement{
    public Man() {
    }
    public Man(String name,String country){
        this.name=name;
        this.country=country;
    }
    public void exercise(){
        System.out.println(name+"正在和范冰冰在床上锻炼中");

    }

    void speak(String str){
        System.out.println("姓名为"+name+"的"+country+"人在说着"+str);

}
    public void life(){
        speak("叽哩咕噜语");
        exercise();

}
}