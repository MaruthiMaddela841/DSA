package arrays;

// https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaxAvgSubArray {

	public static void main(String[] args) {
		
		findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);

	}
	
	public static double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(i>=k-1){
                if(i==k-1){
                    avg=sum/k;
                }
                double temp=sum/k;
                if(avg<temp){
                    avg=temp;
                }
                sum -= nums[i-k+1];
            }
        }
        return avg;
    }

}
