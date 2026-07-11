package strings;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
	
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!isValid(s.charAt(left))){
                left++;
                continue;
            }
            if(!isValid(s.charAt(right))){
                right--;
                continue;
            }
            char l=s.charAt(left);
            char r=s.charAt(right);
            if((s.charAt(left) >= 'A' && s.charAt(left) <= 'Z') ){
                l=(char) (l+32);
            }
            if((s.charAt(right) >= 'A' && s.charAt(right) <= 'Z') ){
                r=(char) (r+32);
            }
            if(l!=r){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    boolean isValid(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) return true;
        else return false;
    }

}
