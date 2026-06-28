package arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] arr= new int[] {0,3,2,9,0,1,0};
		moveZeroes(arr);

	}
	
	public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
    }

}
