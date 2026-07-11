package strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character
public class FindWordsContainingCharacters {

//	Sol1
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> res = new LinkedList();
		int count = -1;
		for (String s : words) {
			count++;
			if (s.contains(Character.toString(x))) {
				res.add(count);
			}
		}
		return res;
	}

//	Sol2
	public List<Integer> findWordsContaining2(String[] words, char x) {
		List<Integer> res = new ArrayList();
		String target = Character.toString(x);
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if (s.contains(target)) {
				res.add(i);
			}
		}
		return res;
	}
	
//	Sol3
	public List<Integer> findWordsContaining3(String[] words, char x) {
        List<Integer> res= new ArrayList();
        String target = Character.toString(x);
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for (char c : s.toCharArray()) {
                if (c == x) {
                res.add(i);
                break;
                }
            }
        }
        return res;
    }
}
