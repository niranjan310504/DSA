public class Solusion_392 {
    public static boolean isSubsequence(String s, String t) {
        int count=0;
        int j =0;
        for(int i =0; i<s.length();i++){
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    count++;
                    j++;
                    break;
                }j++;
                
            }
        }if(s.length()==count){
            return true;
        }else{return false;}
    }

    /*Best Solution
    class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == t || s.length() == 0)
            return true;
            
        char[] sc = s.toCharArray();
        int i = 0;
        for(char c : t.toCharArray()){
            if(c == sc[i])
                i++;
            if(i == sc.length)
                return true;
        }

        return i == sc.length;

    }
} */
    public static void main(String[] args) {
        String s = "abc" ;
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
