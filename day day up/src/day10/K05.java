package day10;

import java.util.Random;
import java.util.Scanner;

public class K05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s=sc.nextLine();
        char[] b=s.toCharArray();
        int zm=0;int sz=0;int zf=0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]>=48&&b[i]<=57){
                sz++;
            }else if (b[i]>=65&&b[i]<=90||b[i]>=97&&b[i]<=122){
                zm++;
            }else {
                zf++;
            }

        }
        System.out.println("英文字母个数:"+zm);
        System.out.println("数字个数:"+sz);
        System.out.println("其它字符个数:"+zf);
    }
}
