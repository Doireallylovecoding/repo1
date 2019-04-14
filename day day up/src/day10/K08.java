package day10;

import java.util.ArrayList;

public class K08 {
    public static void main(String[] args) {
        String arr[]={"0af3s2f","s6ds1","jjww","lailai"};
        abc(arr);
    }
    public static void  abc(String[]arr) {
        ArrayList<String> d = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
//            d.add(arr[i]);
            char[] f = arr[i].toCharArray();
            for (int j = 0; j < f.length; j++) {
                if (f[j] >= 48 && f[j] <= 57) {
                    break;
                }else if (j==f.length-1){
                   d.add(arr[i]) ;
                }
            }
        }
        System.out.println("删除有数字的字符串之后的集合元素有:");
        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));
        }
    }



}
