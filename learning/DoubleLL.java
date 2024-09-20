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
    public void rmv(int data){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp= head;
        //traverse to the element
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Element not found");
            return;
        }
        if(temp == head){
            head=head.next;
            if(head != null){
                head.prev=null;
            }else{
                tail=null;
            }
        }
        if( temp == tail){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            temp.prev.next= temp.next;
            temp.next.prev=temp.prev;
        }
        temp.next=null;
        temp.prev=null;
        size--;
    }
    public void reverseDll(){
        Node curr = head;
        Node prev = null;
        Node next;
        if(head== null){
            System.out.println("element is empty");
            return;
        }
        while(curr != null){
            next=curr.next;
            curr.next =prev;
            curr.prev=next;
            prev=curr;
            curr = next;
    }
        head=prev;
    }
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(7);
        dll.printLinkedList();
        // dll.rmv(6);
        dll.reverseDll(); 
        dll.printLinkedList();
        System.out.println(dll.size);
        
    }

}
