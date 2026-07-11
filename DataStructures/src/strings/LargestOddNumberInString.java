package strings;

// https://leetcode.com/problems/largest-odd-number-in-string/
public class LargestOddNumberInString {
	
	public String largestOddNumber(String num) {
        String res="";
        for(int i=num.length()-1;i>=0;i--){
            int temp=num.charAt(i);
            if(temp%2!=0){
                res=num.substring(0,i+1);
                break;
            }
        }
        return res;
    }

}
