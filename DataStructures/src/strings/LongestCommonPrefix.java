package strings;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                    if(i>=strs[j].length()){
                        return strs[0].substring(0, i);
                    }
                    if(strs[j].charAt(i)!=c){
                       return strs[j].substring(0,i);
                    }
            }
        }
        return strs[0];
    }
}
