package day10;

public class K16 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="传智播客";
        d.goplay();

    }
}
abstract class Animal{
    String name;
    abstract void speak(String str);
}

interface Sports{
    void swimming();
}

class Dog extends Animal implements Sports{
    public Dog() {
    }
    public Dog(String name){
        this.name=name;
    }

    void speak(String str) {
        System.out.println(name+"说:"+str);
    }
    public void swimming(){
        System.out.println(name+"正在疯狂吸金中");
    }
    void goplay(){
        speak("我要吸光你们的钱");
        swimming();
    }

}