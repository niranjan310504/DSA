/**
 * Solution_189
 */
import java.util.*;
public class Solution_189 {
    public static void Rotate_Array(int[] nums, int k){
        k=k%nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);
    }
    public static void reverseArray(int[] arr, int s, int e){
        int temp=0;
        while(s<e){
            temp= arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] nums= {1};
        int k =3;
        Rotate_Array(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}