import java.util.*;

import java.util.*;

public class Euclidean_algorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        Boolean flag = false;
        int count = 0;

        while (!flag){
            if(a == 0){
                flag = true;
                System.out.println(b + " " + count);
            } else if(b == 0){
                flag = true;
                System.out.println(a + " " + count);
            }
            else{
                if (a > b){
                    a = a - b;
                    count++;
                } else{
                    b = b - a;
                    count++;
                }
            }
        }
    }
}
