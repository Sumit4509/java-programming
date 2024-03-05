import java.util.*;
public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //till here code is for upper part 
        for(int i =1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j =1 ;j <=2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // code for bottom part
    }
}
