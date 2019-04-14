package day10;

import java.util.Random;
import java.util.Scanner;

public class k02 {
    public static void main(String[] args) {
        Random r=new Random();
        int a=r.nextInt(11)+50;
        Scanner sc=new Scanner(System.in);

        System.out.println("系统产生了一个50-60之间的数字,请猜出这个数字:");
        while (true) {
            int s=sc.nextInt();
            if (s>a){
                System.out.println("比生成的随机数大,请继续猜");
            }else if (s<a){
                System.out.println("比生成的随机数小,请继续猜");
            }else {
                s=a;
                System.out.println("恭喜你,猜对了!你这个臭傻逼!!!");
                break;
            }

        }


    }
}
