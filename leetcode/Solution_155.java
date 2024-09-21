/**
 * Solution_155
 */
import java.util.*;
public class Solution_155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public Solution_155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty()|| val<minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int popped_value=stack.pop();
        if(popped_value==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();

    }
    
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        Solution_155 obj = new Solution_155();
        obj.push(5);
        obj.push(3);
        obj.push(7);
        System.out.println("Current Minimum: " + obj.getMin());
    }
}