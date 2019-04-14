package day10;

public class K17 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        Studen  s=new Studen();
        t.name="杨文君";
        t.course="java";
        s.name="李隆基";
        s.score=99;
        s.teacher=t;
        t.teaching();
        s.getMyResult();

    }
}

interface Teach{
    void teaching();
}
class Teacher implements Teach{
    String name;
    String course;
    public Teacher() {
    }
    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }
    public void teaching(){
        System.out.println("我是"+name+"老师,"+"我教"+course+"学科");

    }
}

 class Studen{
    String name;
    int score;
    Teacher teacher;

     public Studen() {
     }

     public Studen(String name, int score, Teacher teacher) {
         this.name = name;
         this.score = score;
         this.teacher = teacher;
     }

     void getMyResult(){
        System.out.println("我是学生"+name+",我的老师是"+teacher.name+",他教我"+teacher.course);
         if (score<=60){
             System.out.println("我的分数太低了,无颜面对江东父老啊,唯有头悬梁,锥刺股,发奋图强了");
         }else {
             System.out.println("我最近一次考试分数是:"+score+",要继续加油呀!我可是要成为百万年薪的男人的呀!!!");
         }
    }



}