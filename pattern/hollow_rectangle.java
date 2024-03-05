import java.util.*;
public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  rows");
        int n = sc.nextInt();
        System.out.println("Enter the no columns");
        int m = sc.nextInt();
        // here we check if i or j is 1 or i=n or j=m
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
}
