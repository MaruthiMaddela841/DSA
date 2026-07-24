package binarysearch;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Boundary Search
public class FindMinInSortedRotatedArray {
	
	public int findMin(int[] nums) {
	       int left = 0;
	       int right = nums.length-1;
	        while(left < right){
	            int mid = left+(right-left)/2;
	            if(nums[mid]<nums[right]){
	                right=mid;
	            }else{
	                left=mid+1;
	            }
	        }
	        return nums[left];
	    }

}
/*Pattern:
Boundary Search

Observation:
Array consists of two sorted parts.

Compare nums[mid] with nums[right]:

1. nums[mid] > nums[right]
   → mid is in left sorted part
   → minimum is to the right
   → left = mid + 1

2. nums[mid] < nums[right]
   → mid is in right sorted part
   → minimum could be mid
   → right = mid

Loop Invariant:
Minimum is always inside [left, right].

Time: O(log n)
Space: O(1)*/
