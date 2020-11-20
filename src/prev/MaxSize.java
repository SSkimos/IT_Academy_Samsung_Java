package prev;

import java.util.*;

public class MaxSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int flag = 0;
        int localmax = 1, max = 1;
        int prev = in.nextInt();
        int number =  in.nextInt();
        while (number != 0){
            if (flag == 1) {
                if (number > prev) localmax++;
                else {
                    if (localmax > max) max = localmax;
                    localmax = 2;
                    if (number < prev) flag = 2; else flag = 0;
                }
            } else if (flag == 2) {
                if (number < prev) localmax++;
                else {
                    if (localmax > max) max = localmax;
                    localmax = 2;
                    if (number > prev) flag = 1; else flag = 0;
                }
            } else {
                if (prev < number){
                    flag = 1;
                    localmax = 2;
                }
                else if (prev > number){
                    flag = 2;
                    localmax = 2;
                }
                else flag = 0;
            }
            prev = number;
            number = in.nextInt();
        }
        if(localmax > max)
            max = localmax;
        System.out.println(max);
    }
}
