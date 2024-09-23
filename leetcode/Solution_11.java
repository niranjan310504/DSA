public class Solution_11 {
    public static int maxArea(int[] height) {
      int i =0;
      int j= height.length-1;
      int maxArea=0;
      while (i<j) {
        int height_curr = Math.min(height[i], height[j]);
        int width = j-i;
        int area = height_curr*width;
        maxArea = Math.max(area, maxArea);
        if(height[i]<height[j]){
            i++;
        }else{j--;}
      } return maxArea; 
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
