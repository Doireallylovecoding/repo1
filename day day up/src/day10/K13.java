package day10;

import javax.sound.sampled.Line;

public class K13 {
    public static void main(String[] args) {
        line lintest=new line();
        lintest.setEmploymentClass("百万年薪班");
        lintest.setMoney("你太帅了,不要钱!");

//        System.out.println(lintest.getEmploymentClass());

        Student stu=new Student();
        stu.setName("金城武");
        stu.setScore(101);

       stu.setBanji(lintest);

//        System.out.println(stu.getBanji());

        stu.exam();
        stu.studyLine();

    }
}

//__________________________________________________________________________接口
interface Study{
    abstract void studyLine();
}

//__________________________________________________________________________班级类
class line{
    public void studyLine(){}
    String employmentClass;
    String money;
//   line bj=new line();

    public line() {
    }

    public line(String employmentClass, String money) {
        this.employmentClass = employmentClass;
        this.money = money;
    }

    public String getEmploymentClass() {
        return employmentClass;
    }

    public  String getMoney() {
        return money;
    }

    public void setEmploymentClass(String employmentClass) {
        this.employmentClass = employmentClass;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
//____________________________________________________________________________Student 继承Study 类
 class Student implements Study{
    String name;
    int score;
   public line banji;
    void  exam(){
        if (getScore()>=60){
            System.out.println(getName()+"您的成绩为"+getScore()+",考试通过！");
        }else {
            System.out.println(getName()+"的成绩为"+getScore()+",考试不通过");
        }

    }
     public void studyLine(){
         System.out.println("您报名的就业班为:"+getBanji().getEmploymentClass()+"。应缴学费:"+ getBanji().money);
    }

     public Student() {

     }

    public Student(String name, int score, line banji) {
        this.name = name;
        this.score = score;
        this.banji = banji;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public line getBanji() {
        return banji;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBanji(line banji) {
        this.banji = banji;
    }
}