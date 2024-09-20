import java.util.*;
public class stack_practice {
    static Stack<Integer> s = new Stack<>();
    
    public static void print_stack(){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static int[] stockSpan(int [] stock){
        int span[] = new int[stock.length];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        span[0]= 1;
        for(int i =0; i<stock.length; i++){
            int current = stock[i];
            while(!s.isEmpty() && current>=stock[s.peek()] ){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-s.peek();//span=current high - previous high
            }
            s.push(i);
        }return span;

    }
    public static int[] nextGreater(int[] nums){
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[nums.length];
        for(int i = nums.length-1; i>=0;i--){
            int current = nums[i];
            while (!s.isEmpty() &&current>=nums[s.peek()] ) {
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=nums[s.peek()];
            }s.push(i);
        }return nextGreater;
    }
    

    public static void main(String[] args) {
        // s.push(10);
        // s.push(20);
        // s.push(30);
        int[] stock ={9,5,7,3,9,4,2,6,7,6,4,2};
        System.out.println(Arrays.toString(nextGreater(stock)));
        
    }
}
