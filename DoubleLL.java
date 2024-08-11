public class DoubleLL {
    public class  Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);

        if(head == null){
            head=tail=newNode;
            size=1;
            return;
        }
        newNode.next=head;
        head.prev=newNode; 
        head=newNode;
        size++;
    }
    public void printLinkedList(){
        Node temp = head;
        System.out.print("null<->");
        while (temp!=null) {
            System.out.print(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(7);
        dll.printLinkedList();
        System.out.println(dll.size);
    }
}
