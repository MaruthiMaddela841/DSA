package strings;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            freq[c1-'a']++;
            freq[c2-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 || freq[i]<0) return false;
        }
        return true;
    }
	
}
