package fundamentals;

// https://leetcode.com/problems/palindrome-number
public class PalindromeNumber {

	public static void main(String[] args) {
		
		if(isPalindrome(121)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	
	public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int half=0;
        while(x>half){
            half=half*10+x%10;
            x/=10;
        }
        if(x==half || x==half/10) return true;
        else return false;
    }

}
