import java.util.Arrays;

public class Solution_274 {
    public static int hIndex(int[] citations){
        Arrays.sort(citations);
        int n=citations.length;
        for(int i =0; i<n;i++){
            if(citations[i]>=n-i){
                return n-i;
            }
        }return 0;
    }
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
}
