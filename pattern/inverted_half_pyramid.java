import java.util.*;
public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
