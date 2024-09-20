/**
 * Solution_27
 */
public class Solution_27 {
    public static int removeElement(int[] nums, int val) {
        int not_val=nums.length;
        int j=nums.length -1;
        int temp;
        int i =0;
        while(i<nums.length){
            if(nums[i]==val){
                nums[i]= '_';
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                not_val--;
            }
            else{
                i++;
            }
        }
        return not_val;
    }
/*BEST SOLUTION
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=val) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;   
    }
} */
    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int result = removeElement(nums,2);
        System.out.println(result);
    }
}