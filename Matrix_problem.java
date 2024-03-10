import java.util.*;
public class Matrix_problem {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("enter the value of matrix");
    int[][]a=new int[n][m];

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
        
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
// print the value of matrix in spiral order 
        // int row_s=0;
        // int row_e=n-1;
        // int col_s=0;
        // int col_e=m-1;
        // while(row_s<=row_e && col_s<=col_e){
        //     for(int i=col_s;i<=col_e;i++){
        //         System.out.print(a[row_s][i]);
        //     }
        //     row_s++;

        //     for(int i=row_s;i<=row_e;i++){
        //         System.out.print(a[i][col_e]);
        //     }
        //     col_e--;

        //     for(int i=col_e;i>=col_s;i--){
        //         System.out.print(a[row_e][i]);
        //     }
        //     row_e--;

        //     for(int i=row_e;i>=row_s;i--){
        //         System.out.print(a[i][col_s]);
        //     }
        //     col_s++;
        // }

// print the transpose of matrix 
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
}
}