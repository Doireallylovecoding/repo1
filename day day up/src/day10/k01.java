package day10;

import java.util.Random;

class Arr{
    public static int[] getNewArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<10){
                arr[i]=0;

            }
        }
          return arr;
        }
}

public class k01 {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Random r=new Random();
        System.out.println("随机生成的数组中的元素是:");
        for (int i = 0; i < 5; i++) {
            arr[i]=r.nextInt(46)+5;
            System.out.print(arr[i]+"  ");
        }
       int []arr2= Arr.getNewArr(arr);
        System.out.println();
        System.out.println("调用方法修改后的数组中的元素是:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
        }

}
