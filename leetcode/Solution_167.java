import java.util.Arrays;
import java.util.HashMap;

public class Solution_167 {
    public static int[]  twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> compliment = new HashMap<>();
        for(int i =0; i<numbers.length;i++){
            Integer complimentIndex = compliment.get(numbers[i]);
            if(complimentIndex != null){
                return new int[]{i, complimentIndex};
            }
            compliment.put(target-numbers[i],i);
        }return null;
    }
    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        int target= 9;
        int[] result = twoSum(numbers,target);
        System.out.println(Arrays.toString(result));
    }
}
/* Brute force method
int[] result = new int[2];
        for(int i =0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    result[0]= i;
                    result[1]= j;
                }
            }
        }return result; */