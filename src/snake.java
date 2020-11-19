import java.util.*;

public class snake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ввод

        int n = in.nextInt();
        int m = in.nextInt();

        int k = 0;

        int [][] a = new int [n][m];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = k;
                    k++;
                }
            } else for (int j = m - 1; j >= 0; j--) {
                a[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i][j] < 10)
                    System.out.print("  ");
                else if (a[i][j] >= 10 && a[i][j] < 100)
                    System.out.print(" ");

                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}