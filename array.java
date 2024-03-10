import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Declaration of array
    // both are correct
        // int a[];
        // int[]a;
    // when we know the size of array
        // int a[]=new int[5];
    // when you know the values
        // int a[]={2,1,43,55};
// accessing the values of array 
        // a[0];   first value
        // a[1];   second value
// initailizing value to array
        // for(int i=0;i<len_a;i++){
        //     a[i]=sc.nextInt();
        // }
// accessing the values of array
        // for(int i=0;i<len_a;i++){
        //     System.out.print(a[i]);
        // }



// Declaration of 2d array 
        // int [][]a=new int [][]; 
        // first bracket is for row and second is for column
// Accessing the values of 2d array
        // System.out.println(a[1][3]);

    // create a 2d matrix  of nxm
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][]a=new int[n][m];
    System.out.println("Enter the value");

// Initalizing values of array
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }
// Accessing values of array
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    }
}
