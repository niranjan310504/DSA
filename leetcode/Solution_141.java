public class Solution_141 {
    class ListNode {
           int val;
            ListNode next;
            ListNode(int x) {
                 val = x;
                next = null;
            }
         }
         public boolean hasCycle(ListNode head) {
            ListNode f1 = head;
            ListNode f2= head;
            while(f2!=null && f2.next!=null){
                f1=f1.next;
                f2=f2.next.next;
                if(f1==f2){
                    return true;
                }
            }return false;  
        }
    public static void main(String[] args) {
        Solution_141 solution = new Solution_141();

        // Test case 1: Linked list without a cycle
        ListNode node1 = solution.new ListNode(1);
        ListNode node2 = solution.new ListNode(2);
        ListNode node3 = solution.new ListNode(3);
        ListNode node4 = solution.new ListNode(4);

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> null
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Checking if the list has a cycle
        System.out.println("Test case 1 (No cycle): " + solution.hasCycle(node1)); // Expected: false

        // Test case 2: Linked list with a cycle
        ListNode node5 = solution.new ListNode(5);
        ListNode node6 = solution.new ListNode(6);
        ListNode node7 = solution.new ListNode(7);

        // Creating the linked list: 5 -> 6 -> 7 -> 6 (cycle back to node 6)
        node5.next = node6;
        node6.next = node7;
        node7.next = node6; // Creates a cycle

        // Checking if the list has a cycle
        System.out.println("Test case 2 (Cycle exists): " + solution.hasCycle(node5));
    }    
}
