package strings;

// https://leetcode.com/problems/repeated-string-match/
public class RepeatedStringMatch {

	public int repeatedStringMatch(String a, String b) {
        int alength=a.length();
        int blength=b.length();
        int minRepeat=(blength+alength-1)/alength;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<minRepeat;i++){
            sb.append(a);
        }
        if(sb.indexOf(b) != -1) return minRepeat;
        else{
            sb.append(a);
        }
        if(sb.indexOf(b) != -1) return minRepeat+1;
        return -1;
    }
}
