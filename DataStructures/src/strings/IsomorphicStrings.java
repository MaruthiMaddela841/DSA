package strings;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        char[] smap = new char[256];
        char[] tmap = new char[256];
        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            
            if(smap[c1]!='\u0000'){
                if(tmap[c2]==c1) continue;
                else return false;
            } else{
                if(tmap[c2]=='\u0000'){
                    smap[c1]=c2;
                    tmap[c2]=c1;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    
}
