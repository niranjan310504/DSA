import java.util. *;
public class StackB  {
    static class Stackk{
        static  ArrayList<Integer> list =new ArrayList<>();

        public static void push(int data){
            list.add(data);
        }
        public static int  pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static boolean isEmpty(){
            return list.isEmpty();
        }
    }

    public static void push_at_bottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        push_at_bottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character>S = new Stack<>();
        int idx=0;
        
        while(idx<str.length()){
            S.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!S.isEmpty()){
            char curr=S.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i =1; i< stock.length;i++){
            int currentPrice = stock[i];
            while(!s.isEmpty()&& currentPrice>stock[s.peek()]){
                s.pop();
        }
        if(s.isEmpty()){
            span[i]= i+1;
        }else{
            int prevHigh= s.peek();
            span[i]=i-prevHigh;
        }
        s.push(i);
        }
    }
    public static void nextGreater(int arr[], int ng[]){
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                    s.pop();
        }
        if(s.isEmpty()){
            ng[i]=-1;
            s.push(i);
        }else{
            ng[i]=arr[s.peek()];
        }
    }
}
    public static void main(String[] args) {
        //Stack s =new Stack();
    int stock[] = {100,80,70,60,85,100};
    int ng[] = new int[stock.length];
    nextGreater(stock,ng);

    for (int i=0; i<ng.length; i++){
        System.out.println(ng[i]+" ");
    }

}
}
