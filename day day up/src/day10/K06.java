package day10;

import java.util.Random;
import java.util.Scanner;

public class K06 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Random s=new Random();
        System.out.println("随机生成的数组元素为:");
        for (int i = 0; i < 5; i++) {
            int sjs=s.nextInt(99)+1;
            arr[i]=sjs;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("请输入2-5之间的一个数字:");
        Scanner sc=new Scanner(System.in);
        int sz=sc.nextInt(s.nextInt(6)+2);
        System.out.println("符合条件的元素为:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%sz==0){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
