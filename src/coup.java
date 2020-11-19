import java.util.*;

public class coup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ввод

        int n = in.nextInt();
        int m = in.nextInt();
        int [][] a = new int [n][m];
        int [][] b = new int [m][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = in.nextInt();
            }
        }

        System.out.println(m + " " + n);

        for (int i = 0; i < m; i++){
            for (int j = n - 1; j >= 0; j--){
                b[i][j] = a[n-1-j][i];
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
