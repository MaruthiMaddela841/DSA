package fundamentals;

// https://leetcode.com/problems/reverse-integer/description
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(1234)); //Time: O(log n), Space: O(1)
	}

	public static int reverse(int x) {
		int res = 0;
		int max = Integer.MAX_VALUE;
		// max=2147483647
		// res=214748364 * 10 -> max=res*10+digit
		// digit=7
		int min = Integer.MIN_VALUE;
		// min=-2147483648
		while (x != 0) {
			int digit = x % 10;
			if ((res > max / 10) || (res == max / 10 && digit > 7)) {
				return 0;
			}
			if ((res < min / 10) || (res == min / 10 && digit < -8)) {
				return 0;
			}
			res = res * 10 + x % 10;
			x /= 10;
		}
		return res;
	}

}
