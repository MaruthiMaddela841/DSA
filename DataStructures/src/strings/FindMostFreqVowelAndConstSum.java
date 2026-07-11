package strings;

// https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
public class FindMostFreqVowelAndConstSum {
	// Sol1
	public int maxFreqSum(String s) {
		int[] freq = new int[26];
		boolean[] isVowel = new boolean[26];
		int vmax = 0;
		int cmax = 0;

		isVowel['a' - 'a'] = true;
		isVowel['e' - 'a'] = true;
		isVowel['i' - 'a'] = true;
		isVowel['o' - 'a'] = true;
		isVowel['u' - 'a'] = true;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c - 'a'] = freq[c - 'a'] + 1;
		}
		for (int i = 0; i < 26; i++) {
			int temp = freq[i];
			if (isVowel[i]) {
				if (vmax < temp) {
					vmax = temp;
				}
			} else {
				if (cmax < temp) {
					cmax = temp;
				}
			}
		}
		return vmax + cmax;
	}

	// Sol2
	public int maxFreqSum2(String s) {
		int[] freq = new int[26];
		int vmax = 0;
		int cmax = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			freq[c - 'a'] = freq[c - 'a'] + 1;
		}
		for (int i = 0; i < 26; i++) {
			char c = (char) ('a' + i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vmax = Math.max(vmax, freq[i]);
			} else {
				cmax = Math.max(cmax, freq[i]);
			}
		}
		return vmax + cmax;
	}
}
