package arrays;

// https://leetcode.com/problems/remove-element/description/
public class RemoveElement {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,4,6,2,4};
		removeElement(arr, 4);
		for(int n:arr) {
			System.out.print(n);
		}
	}
	
	public static int removeElement(int[] nums, int val) {
	       int k=0;
	       for(int i=0;i<nums.length;i++){
	        if(nums[i]!=val){
	            nums[k]=nums[i];
	            k++;
	        }
	       }
	       return k;
	    }

}
