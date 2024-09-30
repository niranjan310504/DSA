import java.util.HashMap;
import java.util.List;

public class Solution_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
    
        twoSum(nums, 0);
    }
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
}
