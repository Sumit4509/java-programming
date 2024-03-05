import java.util.*;
public class inverted_rotated_half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            // printing space
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            }
            // printing stars
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
