package day10;

import java.util.ArrayList;

public class k022 {
    public static void main(String[] args) {

        worker s1=new worker("凤姐",18,2000);
        worker s2=new worker("石榴姐",38,20000);
        worker s3=new worker("刘德华",58,50000000);
//        worker s4=new worker();
//        s3.getAge();
        worker [] w1={s1,s2,s3};
        ArrayList<worker> w2=new ArrayList<>();
        for (int i = 0; i < w1.length; i++) {
            w2.add(w1[i]);
        }
        for (int i = 0; i < w1.length; i++) {
            String s=w1[i].getName();
            if (s.equals("刘德华")){
                w2.remove(i);
            }
        }
        for (int i = 0; i < w2.size(); i++) {
            w2.get(i).work();
            }

        }

    }


class worker{
   private String name;
   private int age;
   private double salary;

    public worker() {
    }

    public worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   public void  work(){
        System.out.println(name+" "+age+" "+salary);
    }
}
