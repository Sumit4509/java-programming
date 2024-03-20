import java.util.*;
public class Linkedlistdefault {
    public static void main(String[] args) {
        // declaration 
        LinkedList<String> list= new LinkedList<String>();

        // Add element from front
        list.addFirst("is");
        list.addFirst("This");
    
        
        // Add element in last
        list.addLast("a");

        // if we just write add it will take it as last by default
        list.add("list");

        // print list
        System.out.println(list);

        // delete element from front
        list.removeFirst();
        System.out.println(list+"after removal of first element");

        // delete element form last
        list.removeLast();
        System.out.println(list+"after removal of last element");

        // size of list
        System.out.println(list.size());

        // traverse on each element 
        for(int i=0 ;i<list.size();i++){
            System.out.print(list.get(i)+" --> "); //to get element at particular index we use get function;
        }
    }

}
