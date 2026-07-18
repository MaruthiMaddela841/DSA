package strings;

// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
public class BeautySum {

	public static void main(String[] args) {
		
		String s="aabcbaa";
		int res=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int[] freq= new int[26];
			for(int j=i;j<s.length();j++) {
				freq[s.charAt(j)-'a']++;
				int max=0;
				int min=Integer.MAX_VALUE;
				for(int r:freq) {
					if(r>0) {
						if(r<min) {
							min=r;
						}
						if(r>max) {
							max=r;
						}
						
					}
				}
				res+=(max-min);
			}
		}
		
		System.out.println(res);

	}

}
