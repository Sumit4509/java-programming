import java.util.*;
public class rectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  rows");
        int n = sc.nextInt();
        System.out.println("Enter the no columns");
        int m = sc.nextInt();

        for (int i=1;i<=n ;i++){
            for(int j =1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
