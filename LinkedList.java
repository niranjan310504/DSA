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

    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        //check if linked list is empty
        if(head==null){
            head = tail = newNode;
            return;
        }
        //assign the value of head to the pointer (newNode.next) of new Node
        newNode.next = head;
        //assign head variable the value to new node
        head = newNode;
    }

public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
}
}
