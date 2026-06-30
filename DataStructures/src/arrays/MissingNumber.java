package arrays;

// https://leetcode.com/problems/missing-number
public class MissingNumber {

	public static void main(String[] args) {
		
		missingNumber(new int[] {3,0,1});

	}
	
	public static int missingNumber(int[] nums) {

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        int res=(n*(n+1))/2;
        return res-sum;
    }

}
