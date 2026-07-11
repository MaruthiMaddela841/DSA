package strings;

// https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class SplitAStringInBalanceStrings {
	
	    public int balancedStringSplit(String s) {
	        int balance=0;
	        int answer=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='R'){
	                balance++;
	            }else{
	                balance--;
	            }
	            if(balance==0){
	                answer++;
	            }
	        }
	        return answer;
	    }
}
