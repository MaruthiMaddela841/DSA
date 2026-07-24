package binarysearch;

// https://leetcode.com/problems/sqrtx/
// Binary Search - Find Last Valid Answer
public class Sqrtx {
	
	public static void main(String[] args) {
		System.out.println(mySqrt(63));
	}
	
	public static int mySqrt(int x) {
		int left=0;
		int right=x;
		int lastValid=0;
		while(left<=right) {
			int mid=(left+right)/2;
			long square=(long)mid*mid;
			if(square==x) return mid;
			if(square<x) {
				left=mid+1;
				lastValid=mid;
			}else {
				right=mid-1;
			}
		}
		return lastValid;
	}

}
