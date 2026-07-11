package strings;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
	
//	Sol1
	public int lengthOfLastWord(String s) {
        String str=s.trim();
        String[] arr=str.split(" ");
        return arr[arr.length-1].length();
    }
	
//	Sol2
	public int lengthOfLastWord2(String s) {
        int length=s.length()-1;
        int res=0;
        int track=0;
        for(int i=length;i>=0;i--){
            char c=s.charAt(i);
            if(c==' ' && track>0) return res;
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                track++;
                res++;
            }
        }
        return res;
    }
	
//	Sol3
	public int lengthOfLastWord3(String s) {
        int length=s.length()-1;
        int res=0;
        for(int i=length;i>=0;i--){
            char c=s.charAt(i);
            if(c==' ' && res>0) return res;
            if(c!=' ') res++;
        }
        return res;
    }
}
