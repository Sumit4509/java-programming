import java.util.ArrayList;
import java.util.Collection;


public class ArrayListexample {
    public static void main(String[] args) {
        // Declaring 
        ArrayList<Integer> list = new ArrayList<>();

        // adding element at last
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);       
        list.add(11);       


        // get element
        list.get(1); //give the value at 1 st index 

        // add element in middle 
        list.add(1,2); // it will add 2 in first index and shift all right elements by 1

        // set element
        list.set(2,15);  //it will change the value at second position ie 5 to 15

        // size 
        list.size(); // it will print the size of arraylist

        //Delete element 
        list.remove(3); //it will delete value at 3rd index 

        // sorting
         Collection.sort(list);
         System.out.println(list);
    }
}
