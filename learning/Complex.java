 

/**
 * Complex
 */
import java.util.*;
public class Complex {

    public static void Pinc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        Pinc(n-1);
        System.out.print(n+" ");
    }
    
    public static int Fact(int n){
        int fact = 1;
        if(n==0){
            return 1;
        }else{
        fact = n* Fact(n-1);
        return fact;
        }

    }
     
    public static int Sum_of_n(int n){
        int sum =0;
        if(n==1){
            return 1;
        }
        sum = n + Sum_of_n(n - 1);
        return sum;
    }

    public static long Fibo(int n){
        long fibo = 0;
        
        if(n==0|| n==1){
            return n;
        }
        
        fibo = Fibo(n-1) + Fibo(n-2);
        System.out.println(fibo);
        return fibo;
    } 

    public static int first_occ(int arr[] , int key, int i){
        if (i ==  arr.length){
            return -1;
        }if (arr[i]==key){
            return i;
        }
        return first_occ(arr, key, i+1);
    }

    public static int last_occ(int arr[] , int key, int i){
        if(i==arr.length){
            return -1;
        }
        int IsFound = last_occ(arr, key, i +1);
        
        if(IsFound == -1 && arr[i]==key){
            return i;
        } 
        return IsFound;
    }

    public static int optimisedPower(int a , int n){
        if(n == 0){
            return 1;
        }
        int halfPower= optimisedPower(a, n/2);
        int halfPowerSq = halfPower*halfPower;

        if(n %2 !=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int Tiling(int n){
        if(n ==0 || n ==1){
            return 1;
        }
        //horzontal tiling
        int fnm2 = Tiling (n-2);
        // vertical tiling
        int fnm1 = Tiling(n-1);
        
        int total_ways = fnm1 + fnm2;
        return total_ways;
    }

     public static void Remove_Duplicate(String str, StringBuilder newstr, int index, boolean map[]){
        if(index == str.length()){
            System.out.println(newstr);
            return;

        }
        char currChar = str.charAt(index);
        if(map[currChar -'a'] == true ){
            Remove_Duplicate(str, newstr, index +1 , map);
        }
        else{
            map[currChar -'a'] = true;
            Remove_Duplicate(str, newstr.append(currChar), index +1 , map);
        }
       
     }

     public static void BinaryString(int n, int lastplace , String str){
       if(n ==0){
        System.out.println(str);
        return;
       }
      if(lastplace == 0){
        BinaryString(n-1, 0, str+"0");
        BinaryString(n-1, 1,str+"1");
      }
      if(lastplace ==1){
        BinaryString(n-1, 1,str + "0");

      } 
     }

    public static void RecurrsionQ1(int arr[], int key, int index){
        
        if(index == arr.length){
            return ;
        }
        if(arr[index]==key){
            System.out.print(index);
            
        }
        RecurrsionQ1(arr, key, index +1);
    }

    public static void RecurrsionQ2(int n,   String digits[] ){
        if(n==0){
            return;
        }
        int digit = n %10 ;
        RecurrsionQ2(n/10, digits);
        System.out.print(digits[digit] + " ");
    }

    public static int RecurrsionQ3(String str){
        // int count = 0;
        if(0 == str.length()){
            return 0;
        }
        return RecurrsionQ3 (str.substring(1))+1;
    }

    // public static int RecurrsionQ4()

    public static void Tower_hanoi(int n, String Source, String Helper , String Destination){
        if (n==0){
            System.out.println("transfer disk " +n + " from "+ Source + " to " +Destination);
            return; 
        }
        Tower_hanoi(n-1, Source, Destination, Helper);
        System.out.println("transfer disk " +n + " from "+ Source + " to " +Helper);

        Tower_hanoi(n-1, Helper, Source, Destination);

    }
    public static void printarr(int arr[]){
        for(int i  =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei -si +1];
        int i  = si;
        int j= mid +1;
        int k = 0;
         while(i<= mid && j<=ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
               temp[k] = arr[j];
               j++;
            }
            k++;
         }
         while(i<= mid){
            temp[k++]= arr[i++];
         }
         while (j<=ei) {
            temp[k++]= arr[j++];
         }
         //copy temp arry into arr
         for(k =0, i =si; k<temp.length;k++,i++){
            arr[i]=temp[k];
            
         }
    }

    public static void Merge_Sort(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int mid  = si + (ei-si)/2;
        Merge_Sort( arr, si, mid);
        Merge_Sort(arr, mid+1, ei);

        merge(arr, si, mid, ei);

    }
    public static void Quick_Sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivot = partition(arr, si, ei);
        Quick_Sort(arr, si,pivot-1 );
        Quick_Sort(arr, pivot+1, ei);


    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si -1; 
        for(int j =si; j< ei; j++){
            if(arr[j] <= pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
            }
        }i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;
    }

    public static String[] Merge_Sort_String(String[] arr, int si, int ei ){
        if(si == ei){
            String[] A={arr[si]} ;
            return A;
        }

            int mid  = si +(ei-si)/2;
            String[] arr1 =Merge_Sort_String(arr, si,mid );
            String[] arr2 = Merge_Sort_String(arr,mid+1,ei);
            String[] arr3 = merge(arr1,arr2);
            return arr3;

        
    }
    public static String[] merge(String[] arr1, String[] arr2){
        int m =arr1.length;
        int n= arr2.length;
        String[] arr3 = new String[m+n];
        int i =0;
        int j =0;
        int k = 0;
        while( i <m &&  j <n){
        if(Alpabeticalorder(arr1[i],arr2[j])){
            arr3[k]= arr1[i];
            i++;
        }
        else{
            arr3[k]= arr2[j];
            j++; 
        }
        k++;
    }
        while(i<m){
            arr3[k++] = arr1[i++];
         
        }
        while(j<n){
            arr3[k++] = arr2[j++];
        }
        
        return arr3;
    }
    public static boolean Alpabeticalorder(String str1, String str2){
        int result = str1.compareTo(str2);
        if(result < 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static int inversion_count(int arr[], int si, int ei){
        int count =0;
        if(ei>si){
            int mid = si +(ei-si)/2;

            count = inversion_count(arr, si, mid);
            count += inversion_count(arr, mid +1, ei);
            count += inversion_merge(arr, si, mid +1,ei);
        }
        return count;
    }
    public static int inversion_merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei -si +1];
        int i  = si;
        int j= mid+1 ;
        int k = 0;
        int count = 0;
         while(i<= mid && j<=ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
                
            }
            else{
               temp[k] = arr[j];
               count += (mid -i +1);
               j++;
            }
            k++;
         }
         while(i<= mid){
            temp[k++]= arr[i++];
         }
         while (j<=ei) {
            temp[k++]= arr[j++];
         }
         //copy temp arry into arr
         for(k =0, i =si; k<temp.length;k++,i++){
            arr[i]=temp[k];
            
         }
         return count;
    }

        // BACKTRAKING

    public static void findSubsets(String str, String ans , int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //yes choice
        findSubsets(str, ans + str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
       
    }

    public static void Permutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i =0; i<str.length(); i++){
            char curr_char = str.charAt(i);
            String Newstr =str.substring(0,i) + str.substring(i+1);
            Permutation(Newstr , ans +curr_char );
        }
    } 
    public static boolean is_safe(char board[][] , int row, int col){
        //check vertical
        for(int i = row -1; i>=0;i--){
            if( board[i][col]== 'Q'){
                return false;
            }
        }
        //check left diagonal
        for(int i = row -1, j = col -1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //check right diagonal 
        for(int i = row -1, j = col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueen_all_ways(char board[][], int row){
        //IN MAIN FUNCTION
        // for (int i = 0; i< board.length; i++){
        //     for(int j =0; j< board.length ; j++){
        //         board[i][j]= 'x';
        //     }
        // }

        //base case
        if(row==board.length){
            print_board(board);
            return;
            
        }
        
        //column loop
        for(int j =0; j<board.length;j++){
            if(is_safe(board, row,j)){   
                board[row][j]= 'Q';
                Nqueen_all_ways(board, row+1);//funtion call
                board[row][j] ='x';//backtrack
            }

        }
    }
    public static void print_board(char board[][]){
        System.out.println("-------chess board---------");
        for (int i = 0;  i<board.length; i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static int Grid_ways(int i, int j, int n, int m){
        //base
        if(i == n-1&& j==m-1){
            return 1;
        }else if(i==n || j ==n){
            return 0;
        }
        int wR = Grid_ways(i,j+1,n,m);
        int wD = Grid_ways(i+1,j,n,m);
        int ways = 0;
        ways = wR+wD;
        return ways;
    }

    public static void Rat_in_maze(int maze[][], int i, int j, int sol[][]){
        //base
        if(i==maze.length-1 && j== maze.length-1 &&maze[i][j]==1 ){
            sol[i][j]=1;
            print_maze(sol);
            sol[i][j]=0;
            return ;
        }
        
      
        if(is_open(maze, i, j)&& sol[i][j]==0){
            
            sol[i][j]=1;
        
        Rat_in_maze(maze, i+1, j, sol);
        Rat_in_maze(maze, i, j+1, sol);
        Rat_in_maze(maze, i-1, j, sol);
        Rat_in_maze(maze, i, j-1, sol);

        sol[i][j]=0;
    }
}
    
    public static boolean is_open(int maze[][], int i, int j ){
       return(i<=maze.length-1 && j<= maze.length-1 && i>=0 &&j>=0 && maze[i][j]==1);
    }

    public static void print_maze(int board[][]){
        System.out.println("-------  new maze  ---------");
        for (int i = 0;  i<board.length; i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public static void Keypad_combination(char arr[][],String digits,int i,String currentCombination, List<String> result ){
        //base
        if(i == digits.length()){
            result.add(currentCombination);
            return ;
        }
        char digit = digits.charAt(i);
        char character[] = arr[digit - '0'];
        for(char c : character){
        Keypad_combination(arr,digits,i+1,currentCombination+c,result);

        //main
        //  char arr[][] = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
        // {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
        // {'t','u','v'},{'w','x','y','z'}};
    //     List<String> result = new ArrayList<>();
    // Keypad_combination(arr,"23456789",0,"",result);
    // System.out.println(result);
    
    }
}

//Array list

    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        idx1 = list.set(idx1,list.get(idx2));
        idx2 = temp;  
    }

    public static int most_Water(ArrayList<Integer> height){
        int lp =0;
        int rp = height.size() -1;
        int max_water =0;

        while(lp<rp){
            int Height = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int cuur_water = Height*width;
            max_water = Math.max(max_water, cuur_water);
            
            if(lp<rp){
                lp++;
            }
            else{rp++;}
        }return max_water;
    }

    public static boolean Pair_sum(ArrayList<Integer> arr, int target){
        int rp = arr.size()-1;
        int lp = 0;
      while(lp!=rp) {
        if(arr.get(lp)+arr.get(rp)==target){
            return true;
        }else if(arr.get(lp)+arr.get(rp)<target){
            lp++;
        }else{
            rp--;
        }
        
    }return false;

    }

    public static boolean Check_monotonic(ArrayList<Integer> arr){
        boolean inc = true;
        boolean dec = true;
        for(int i = 0; i<arr.size()-1;i++){
            if(arr.get(i)<arr.get(i+1)){
                dec = false;
            }else if (arr.get(i)>arr.get(i+1)){
                inc = false;
            }
        }
        return inc||dec;
    }
    public static void Lonely_numbers(ArrayList<Integer> arr){
        ArrayList<Integer> sol = new ArrayList<>();
        Collections.sort(arr);
        for( int i = 1; i<arr.size()-1; i++){
            if(arr.get(i+1) == arr.get(i)+1 && arr.get(i-1)== arr.get(i)-1){
                sol.add(arr.get(i));
            }
        }printArrayList(sol);
    }
    public static void printArrayList(ArrayList<Integer> arr){
        for (int i =0; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
    public static void main(String args[]){
       ArrayList<Integer> height= new ArrayList<>();
       height.add(1);
       height.add(2);
       height.add(4);
       height.add(3);
       height.add(5);
       height.add(6);
       height.add(7);
       height.add(8);
       height.add(9);
       Lonely_numbers(height);

    } 
}    