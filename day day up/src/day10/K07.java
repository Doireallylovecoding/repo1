package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class K07 {
    public static void main(String[] args) {
        int count=1;
        ArrayList<Integer> os=new ArrayList();
        ArrayList<Integer> js=new ArrayList();
        Scanner sc=new Scanner(System.in);
        while(count<6) {
            System.out.println("请输入第"+count+"个数字:");
            int s=sc.nextInt();
            if (s>200||s<100){
                System.out.println("数字超出范围,请重新输入");
            }else {
                count++;
                if (s%2==0){
                    os.add(s);
                }else {
                    js.add(s);
                }
            }
        }
        System.out.println("偶数集合元素为:");
        for (int i = 0; i < os.size(); i++) {
            System.out.print(os.get(i)+" ");
        }
        System.out.println();
        System.out.println("奇数集合元素为:");
        for (int i = 0; i < js.size(); i++) {
            System.out.print(js.get(i)+" ");
        }
    }

}
