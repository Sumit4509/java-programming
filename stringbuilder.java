import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        // stringbuilder is same as string but here we can add or update our string 
    // declaration
        StringBuilder sb = new StringBuilder("SUMIT");
        System.out.println(sb);

    // charAt method is also same as in string 
        System.out.println("char at 0 index is : " +sb.charAt(0));
        
    // if we want to change ar particular index we use setcharAt()
        sb.setCharAt(1, 'A');
        System.out.println("after changing U to A : "+sb);
        // here we give two arguments first is index and second is value at that index 
    
    // if we want to insert value at particular index
        sb.insert(3,'B');
        System.out.println("after inserting b at 3rd index: "+sb);

    // if we want to delete any indeex value or subarray use delete method 
        sb.delete(2,4);
        // here 4 is inclusive 
        System.out.println("after deleting : " +sb);
    
    // append is also used to add any value at last position 
        sb.append("A");
        sb.append("M");
        sb.append("A");
        System.out.println("after appending ama : "+sb );



    // question - reverse sb
        int n =sb.length();
        for(int i=0;i<n/2;i++){
            int start=i;
            int end= n-i-1;
            char first = sb.charAt(i);
            char last= sb.charAt(end);
            sb.setCharAt(start, last);
            sb.setCharAt(end, first);

        }
        System.out.println(sb);
    }
}
