package fundamentals;

// https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

	public static void main(String[] args) {
		
		System.out.println(search(new int[] {-1,0,3,5,9,12}, 91));

	}
	
	public static int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2; //left + (right - left) / 2 -> better
        while(left<=right){
            if(nums[mid]==target) {
            	return mid;
            }
            if(nums[mid]<target) left=mid+1;
            if(nums[mid]>target) right=mid-1;
            mid=(left+right)/2;
        }
        return -1;
    }

}
