import java.util.*;
public class number_Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i =1;i<=n ;i++){
            for (int j=1;i<=n-j;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i ;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
   
}
