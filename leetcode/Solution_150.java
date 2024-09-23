import java.util.Stack;

public class Solution_150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> s  = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
            if(tokens[i].equals("+") ||tokens[i].equals("-")|| tokens[i].equals("*")||tokens[i].equals("/")  ){
                int num1 = s.pop();
                int num2= s.pop();
                String operator = tokens[i];
                int total =0;
                switch (operator) {
                    case "+":
                        total=num1 + num2;
                        break;
                    case "-":
                        total= num2 - num1;
                        break;
                    case "*":
                        total= num1 * num2;
                        break;
                    case "/":
                        total= num2 / num1;
                        break;
                }
            s.push(total);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }return s.peek();
    }
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
