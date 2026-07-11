package strings;

// https://leetcode.com/problems/reverse-string-ii/
public class ReverseStringII {
	
	public String reverseStr(String s, int k) {
        if(s==null) return s;
        if(s.length()==1) return s;
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int left=i;
            int right=Math.min(i+k-1,s.length()-1);
            while(left<right){
                char temp=c[left];
                c[left]=c[right];
                c[right]=temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }

}
