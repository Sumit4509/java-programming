import java.util.*;

public class functionandmethod {
    // function is a piece of code which takes input and perform operation and provide Output

    // this function name is print_name and it takes string as an input and print that input and don't return any thing so its data type is void 
    public static void print_name(String name){
        System.out.println(name);
        return;
    }

    // this function take two input n1 and n2 and retrun the sum of those two numbers 
    public static int sum_of_two(int n1,int n2){
        return n1+n2;
    }

    // this is function of finding the factorial of the numbers
    public static void factorial(int n){
        
        if(n<0){
            System.out.println("enter valid no ");
            return ;
        }
        int ans = 1;
        for (int i =1;i<=n;i++){
            ans*=i;
        }
       
        System.out.println("factorial of the number is "+ans);
        return;
    
    }





    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


// this code is used for 1st function 
        // String name = sc.nextLine();
        // print_name(name);


// this code is used for 2nd function ie sum
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sum_of_two(a, b);
        // System.out.println("the sum of a and b is: "+c);

// this code is used for 3rd function is factorial
        int a = sc.nextInt();
        factorial(a);


        // last thing ie method 
        // method is also a piece of code which takes input and perform operation and provide Output but only difference is method is called through objects of class and function we call it directly
    }
}
