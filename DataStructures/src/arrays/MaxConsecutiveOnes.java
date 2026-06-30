package arrays;

// https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,1,0,1,1,1};
		findMaxConsecutiveOnes(arr);

	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            if(result<count){
                result=count;
            }
        }
        return result;
    }

}
