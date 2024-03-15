import java.util.*;
public class bitmanipulation {

    // 4 types of operation going to see in this code
    // 1 get this we use to get the bit at particular position
    // 2 set this we use to set 1 to that particular position 
    // 3 clear this we use to set 0 to that particular position
    // 4 update this we update bit at particular postiton
    public static void main(String[] args) {

// get bit
//         // know wheter at particular position bit is 1 or 0
//         int n=5; //0101
//         // if we want to know bit at 3 rd position then we give position =2
//         int pos =2; 
//         // here in case of bit position is taken from right to left 101 so position 
//         int bitmask =1<<pos;
//         // here we created bitmask which is initially 1 but we left shift by pos so now it becomes 100 is binary 
//         if((n&bitmask)==0){
//             System.out.println("at"+ pos+" position 0 bit was there ");
//         }
//         else{
//             System.out.println("at"+ pos+" position 1 bit was there");
//         }


//set bit 

        // int n =5; //101
        // int pos =1 ; // at 1st position that is where 0 bit is there we have to change it to 1 bit  so our n becomes 111 (7)
        // int bitmask = 1<<pos;
        // n=(n|bitmask);
        // System.out.println("after changing the bit at "+pos+ " n is equal to "+n);

// clear bit  - here at certain position bit 1 is given and we have to change it to 0 bit 

        // int n =5; //0101
        // int pos =2 ; // at 2nd position there is 1  we have to convert it to 0;
        // int bitmask = 1<<pos;
        // n = (n^bitmask);
        // System.out.println("after changing bit at "+ pos + " n is equal to "+n );

// update bit   - here at particular postion we have to change that bit ie  from 0 to 1 and from 1 to 0 

        int n =5; //101
        int pos =2; // here at position there can be 1bit or 0bit can be present 
        int bitmask = 1<<pos;
        if((n&bitmask)==0){
            n=n|bitmask;
        }
        else{
            n=n^bitmask;
        }
        System.out.println("after changing bit at "+ pos + " n is equal to "+n );
    }
}






