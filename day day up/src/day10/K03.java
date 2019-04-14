package day10;


import java.util.Scanner;

public class K03 {
    public static void main(String[] args) {
        char[] c=zm();
        int count=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]>=65&&c[i]<=90){
                count++;
            }

        }
        System.out.println("输入的字符串中含大写字母:"+count+"个");
    }


    public static char[] zm(){
        System.out.println("请输入带字母的字符串:");
        Scanner sc=new Scanner(System.in);
        boolean bool=true;
        char[] b = null;
        while (bool) {
            String a=sc.nextLine();
            b=a.toCharArray();
            for (int i = 0; i < b.length; i++) {
                if (b[i]>=65&&b[i]<=122){
                    bool=false;
                    break;

                }else if(i==b.length-1){
                    System.out.println("输入错误,请重新输入带字母的字符串:");
                }
            }
        }
        return b;
    }
}


