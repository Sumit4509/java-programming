import java.util.*;
public class strings {
    public static void main(String[] args) {
        // Strings are immutable which means if stings are created than it can't be changed

/* 
        // declaration 
        String name = "sumit";
        // string can contain space too as it is valid in string 
        String fullname = "sumit kumar";
        // if we want to take input from user then we use sc.next()
        Scanner sc = new Scanner(System.in);
        String location = sc.next();
        // the above location variable only take one value as it is next
        // for whole sentence you need to use nextline
        String all_location= sc.nextLine();
*/
        // now lets see some functions of string 

        // 1. concatenation
        String firstname="sumit";
        String lastname="kumar";
        String fullname= firstname+" "+lastname;
        System.out.println(fullname);

        // 2. length
        System.out.println(fullname.length());

        // 3. charAt()
        for(int i=0;i<fullname.length();i++){
            System.out.println("char at "+i+" index is "+ fullname.charAt(i));
        }
        // 4. compareto
        // this compareTo method is used to compare the strings based on ascii values it returns in int value if first value and second value is equal than it return 0 if first value is greater than second value than it will return possitive value and if first value is smaller than second value than it will give negative value
        int  star=lastname.compareTo(firstname);
        System.out.println("hello"+star);

        // 5. Substring
        // here we use two parameter first is starting index and second is ending index
        System.out.println(fullname.substring(2, 5));
        // the above code will print till 4 th index not 5 as it takes value before end index
        System.out.println(fullname.substring(4));
        // in above code we just given start index and it automatically take end index as last 
         
    }
}
