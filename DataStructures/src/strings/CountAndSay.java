package strings;

// https://leetcode.com/problems/count-and-say/
public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(4));

	}
	
	public static String countAndSay(int n) {
        String current="1";
        if(n==1) return "1";
        n=n-1;
        while(n>0){
            current=buildNext(current);
            n--;
        }
        return current;
    }

	public static String buildNext(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char c = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) != c) {
				sb.append(count);
				sb.append(c);
				c = s.charAt(i);
				count = 1;
			} else {
				count++;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}

}
