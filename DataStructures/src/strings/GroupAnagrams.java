package strings;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList();
		Map<String, List<String>> map = new HashMap<>();
		for (int k = 0; k < strs.length; k++) {
			int[] freq = new int[26];
			String s = strs[k];
			for (int i = 0; i < s.length(); i++) {
				char c1 = s.charAt(i);
				freq[c1 - 'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for (int count : freq) {
				sb.append('#');
				sb.append(count);
			}
			String key = sb.toString();
			if (map.containsKey(key)) {
				List<String> value = map.get(key);
				value.add(strs[k]);
				map.put(key, value);
			} else {
				List<String> li = new ArrayList<>();
				li.add(strs[k]);
				map.put(key, li);
			}
		}

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			res.add(entry.getValue());
		}

		return res;
	}

}
