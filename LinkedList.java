import java.util.*;;

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
    public static int Search(int data){
        if( head ==null){
            System.out.println("list is empty");
            return -1;
        }
        Node temp = head;
        int i =0;
        while (temp!=null) {
            if(temp.data==data){
                System.out.print("found key at index  ");
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    
    public static void Reverse(){
        Node prev = null;
        Node curr =tail= head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        head = prev;
    }
    public static void RmvfromNth(int n){
        int size =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        Node prev=head;
        if(n==size){
            head=head.next;
        }
        int idx =1;
        int itoFin= size-n;
        while(idx<itoFin){
            prev=prev.next;
            idx++;
        }
        prev.next = prev.next.next;
    }

    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2 
            if(fast == slow){
                return true;
            }

        }return false;
    }

    public void rmvCycle(){
        Node slow = head;
        Node fast = head;
        Node prev = null;//last node
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2 
            if(fast == slow){
                isCycle= true;
                break;
            }

        }
        if(isCycle==false){
            return;
        }
        slow = head;
        while (fast!=slow) {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }prev.next=null;//breaking the cycle

    }
    public Node merge(Node left, Node right){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(right != null &&left != null){
            if(left.data <=right.data){
                temp.next= left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next= right;
                right=right.next;
                temp=temp.next;
            }
        }
        while (left != null) {
            temp.next= left;
            left=left.next;
            temp=temp.next;
        }
        while (right != null) {
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }
    public Node getmid(Node head){
        Node fast = head.next;
        Node slow = head;
        
        while(fast!=null && fast.next != null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getmid(head);
        
        //left and right merge sort
        Node rightHead = mid.next;
        mid.next=null;
        Node newLef =mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLef,newRight);
    }
    public void ZIg_zag(){
        Node mid = getmid(head);
        Node curr = mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null){
            next=mid.next;
            mid.next= prev;
            prev=curr;
            curr=next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while(left != null && right != null){
            nextL=left.next;
            left.next=right;
            nextR= right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;

        }

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
    ll.mergeSort(head);
    ll.printLinkedList();
    ll.ZIg_zag();
    ll.printLinkedList();
}}
