import java.util.*;
public class Solution_169 {
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        int i =0;
        int majorityElement=-1 ;
        for(int j =(nums.length/2); j<nums.length; j++){
            if(nums[i]==nums[j]){
                majorityElement=nums[i];
            }else{
                i++;
            }        
    }return majorityElement;
}
/*since it occurs n/2 times in array, it will always occupy n/2 position
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
} */
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement=majorityElement(nums);
        System.out.println(majorityElement);
    }
}
