package prev;

import java.util.*;
import java.io.IOException;

public class Mastica{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = in.nextInt();
        int count = 0;

        int [] aa = new int [10000];
        int [] bb = new int [10000];
        int [] cc = new int [10000];
        int i = 0, j = 0, k = 0;

        while (sum >= a*i){
            while (sum >= a*i + b*j) {
                while (sum >= a*i + b*j + c*k) {
                    if (a*i + b*j + c*k == sum){
                        count++;
                        aa[count] = i;
                        bb[count] = j;
                        cc[count] = k;
                    }
                    k++;
                }
                j++;
                k = 0;
            }
            i++;
            j = 0;
        }
        System.out.println(count);

        for(i = 1; i <= count; i++){
            System.out.println(aa[i] + " " + bb[i] + " " + cc[i]);
        }
    }
}