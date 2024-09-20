public class Solution_80 {
    public static int removeDuplicates_II(int[] nums){
        int i =2;
        for(int j =2; j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }return i;
    }
    public static void main(String[] args) {
        int[] nums= {0,0,1,1,1,1,2,3,3};
        int l = removeDuplicates_II(nums);
        System.err.println(l);
    }
}
