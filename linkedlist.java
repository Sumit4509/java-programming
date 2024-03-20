public class linkedlist {
    Node head;
    private int size;
    linkedlist(){
        this.size=0;
    }
    // creation of node class
    class Node{
        String data;
        Node next;
       
    
        // constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
   
    // ADD FIRST/LAST
    public void addFirst(String data){

        Node newNode = new Node(data);
        if(head == null){
            head =newNode;
        }
        else{
            newNode.next=head;
        head=newNode;
        }
        size++;
        
    }

    // ADD LAST
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node curr= head;
        while(curr.next!=null){
        curr=curr.next;
        }
        curr.next = newNode;
        }
        size++;
    }

    // delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        size--;
        
        head=head.next;
        
    }

    // delete last
    public void deleteLast(){
        
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secondlast=head ;
        Node last=head.next;
            while(last.next!=null){
                last = last.next;
                secondlast = secondlast.next;
            }
            secondlast.next=null;
    }
    public int getsize(){
        return size;
    }

    // print all data 
    public void printList(){
        if(head ==null){
            System.out.println("list is empty");
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist list =new linkedlist();
        list.addFirst("a");
        list.addFirst("there is");
        list.addLast("dog");
        list.deleteLast();
        list.printList();
        int size=list.getsize();
        System.out.println(size);
    }
}
