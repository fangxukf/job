package meituan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by YJSYF on 2016/9/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        in.nextLine();
        //for(int j=0; j<N; j++) {
        int j = 0;
        while (in.hasNext()){
            String str = in.nextLine();
            String[] numList = str.split(",");
            int[] temp = new int[numList.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = Integer.parseInt(numList[i]);
                System.out.println(temp[i]);
            }
            a[j]= getMax(temp);
            j++;
        }
    }
    public static int getMax(int[] temp){
        int[] begin = temp;
        int sum = 0;
        Arrays.sort(temp);
        for(int i=temp.length-1;i>=0;i--){
            /*if(isOk(temp[i])){
                sum+=temp[i];
            }*/
        }
        return 1;
    }


}