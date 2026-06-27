package fundamentals;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println(isPowerOfTwo(17));
	}
	
	public static boolean isPowerOfTwo(int n) {
        if(n > 0 && (n & (n-1)) == 0) return true;
        else return false;
    }

}
