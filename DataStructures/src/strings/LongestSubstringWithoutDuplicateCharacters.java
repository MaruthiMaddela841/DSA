package strings;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters
public class LongestSubstringWithoutDuplicateCharacters {

	public static void main(String[] args) {
		
		lengthOfLongestSubstring("abcbacc");

	}
	
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int length=0;
        int left=0;
            for(int i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    set.add(s.charAt(i));
                }else{
                    while(true){
                        if(!set.contains(s.charAt(i))){
                            set.add(s.charAt(i));
                            break;
                        }
                        set.remove(s.charAt(left));
                            left++;
                    }
                }
                if(length<set.size()){
                    length=set.size();
                }
            }
        return length;
    }

}
