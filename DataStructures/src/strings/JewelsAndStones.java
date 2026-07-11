package strings;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
	
	//Sol1
	public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for(char c: stones.toCharArray()){
            if(set.contains(c)) count++;
        }
        return count;
    }
	
	//Sol2
	public int numJewelsInStones2(String jewels, String stones) {
        int count=0;
        boolean[] isJewel = new boolean[128];

        for (int i = 0; i < jewels.length(); i++) {
            isJewel[jewels.charAt(i)]=true;
        }
        for (int i = 0; i < stones.length(); i++) {
            if(isJewel[stones.charAt(i)]) count++;
        }
        return count;
    }

}
