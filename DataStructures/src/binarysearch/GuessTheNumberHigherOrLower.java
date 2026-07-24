package binarysearch;

// https://leetcode.com/problems/guess-number-higher-or-lower/
// Binary Search
public class GuessTheNumberHigherOrLower {

	public int guessNumber(int n) {
        int left=0;
        int right=Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(guess(mid)==0) return mid;
            if(guess(mid)==1) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
	
	// dummy implementation-not correct
	int guess(int mid) {
		return -1;
	}
}
