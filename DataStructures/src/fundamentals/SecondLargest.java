package fundamentals;

// https://leetcode.com/problems/second-largest-digit-in-a-string
public class SecondLargest {

	public static void main(String[] args) {

		String str = "aa2351";
		int first = -1;
		int second = -1;

		for (char ch : str.toCharArray()) {

			if (!Character.isDigit(ch))
				continue;

			int digit = ch - '0';

			if (digit > first) {
				second = first;
				first = digit;
			} else if (digit < first && digit > second) {
				second = digit;
			}
		}

		System.out.println(second);
	}

}