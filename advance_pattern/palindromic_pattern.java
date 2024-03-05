import java.util.*;
public class palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i =1;i<=n ;i++){
            for (int j=1;i<=n-j;j++){
                System.out.print(" ");
            }
            int m=i;
            for(int j =1;j<=i ;j++){
                System.out.print(m);
                m-=1;
            }
            // till here we done left part first 
            // now further we will do right part 
            m=2;
            for(int j=1;j<i;j++){
                System.out.print(m);
                m+=1;
            }
            System.out.println();
        }
    }
}
