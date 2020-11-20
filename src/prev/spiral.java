package prev;

import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ввод

        int n = in.nextInt();

        int[][] a = new int[2*n+1][2*n+1];

        a[n][n] = 0;

        int x = n;
        int y = n;

        int i = 1;
        int k = 1;

        while (true) {
            for (int j = 0; j < k ; j++) {
                a[x][--y]=i++;
                if (i == (2*n+1)*(2*n+1)) break;
            }
            if (i == (2*n+1)*(2*n+1)) break;
            for (int j = 0; j < k ; j++) {
                a[--x][y] = i++;
            }
            k++;
            for (int j = 0; j < k; j++) {
                a[x][++y] = i++;
                if (i == (2*n+1)*(2*n+1)) break;
            }
            if (i == (2*n+1)*(2*n+1)) break;
            for (int j = 0; j < k; j++) {
                a[++x][y]=i++;
            }
            k++;
        }

        for(i = 0; i < 2*n + 1; i++){
            for(int j = 0; j < 2*n + 1; j++){
                if(a[j][i] < 10)
                    System.out.print("  ");
                if(a[j][i] >= 10 && a[j][i] < 100)
                    System.out.print(" ");
                System.out.print(a[j][i]);
            }
            System.out.println("");
        }
    }
}