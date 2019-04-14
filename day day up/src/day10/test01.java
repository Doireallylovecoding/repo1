package day10;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        int k=10000000;

        ArrayList<Integer> ss=new ArrayList<>();
        for (int i = 3; i < k; i++) {
            for (int j = 2; j <i; j++) {
                if (i%j==0){
                    break;
                }else if (i==j+1){
                    ss.add(i);
                    System.out.print(i+"\t");
                }
                if (i==1000000){
                    System.out.println("一百万啦!");

                }else if (i==2000000){
                    System.out.println("两百万啦!");

                }else if (i==3000000){
                    System.out.println("三面万啦!");
                }else if (i==5000000){
                    System.out.println("五百万啦!");
                }else if (i==6000000){
                    System.out.println("六百万啦!");
                }else if (i==7000000){
                    System.out.println("七百万啦!");
                }else if (i==8000000){
                    System.out.println("八百万啦!");
                }else if (i==9000000){
                    System.out.println("九百万啦!");
                }else if (i==10000000){
                    System.out.println("千万大关终于完成!!!,鸣枪一小时庆祝!!!");
                }


            }

        }
        System.out.println("");
        System.out.print(ss.size()+"\t");


    }
}
