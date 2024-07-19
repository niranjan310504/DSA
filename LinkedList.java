public class LinkedList {
    public static class  Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
         
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        //check if linked list is empty
        if(head==null){
            head = tail = newNode;
            size= 1;
            return;
        }
        size++;
        //assign the value of head to the pointer (newNode.next) of new Node
        newNode.next = head;
        //assign head variable the value to new node
        head = newNode;
    }
    public void AddLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size =1;
            return;
        }
        size++;
        tail.next=newNode;
        tail=newNode;

    }
    public void AddMiddle(int index,int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int curr_index= 0;
        while (curr_index!= index-1) {
            temp=temp.next;
            curr_index++;
        }
        size++;
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    public int Search(int data){
        if( head ==null){
            System.out.println("list is empty");
            return -1;
        }
        Node temp = head;
        int i =0;
        while (temp!=null) {
            if(temp.data==data){
                System.out.println("found key");
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public void printLinkedList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
    }
public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.AddLast(4);
    ll.AddLast(5);
    ll.AddMiddle(3, 69);
    ll.printLinkedList();
}
}
 