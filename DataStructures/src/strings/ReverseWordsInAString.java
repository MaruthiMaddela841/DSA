package strings;

// https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWordsInAString {

	public String reverseWords(String s) {
        StringBuilder str= new StringBuilder("");
        int i=s.length()-1;
        int end=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
                continue;
            }
            if(i<0) return str.toString();
            end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(str.length()==0){
                str.append(s.substring(i+1, end + 1));
            }else{
                str.append(" ");
                str.append(s.substring(i+1, end + 1));
            }
            end=i;
        }
        return str.toString();
    }
	
}
