public class QueueL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null && tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("This queue is empty");
                return;
            }
            if(head == tail){
                tail =head = null;
                return;
            }
            head= head.next;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("this queue is empty ");
                return -1;
            }
            int front = head.data;
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
