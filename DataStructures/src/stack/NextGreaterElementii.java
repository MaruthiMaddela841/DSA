package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-ii/
// Next Greater Element I
public class NextGreaterElementii {
	
	public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack= new Stack<>();
        int[] ans=new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = -1;
        }
        int n=nums.length;
        for(int i=0;i<2*n;i++){
            int idx=i%n;
            while(!stack.isEmpty() && nums[idx]>nums[stack.peek()]){
                int j = stack.pop();
                ans[j] = nums[idx];
            }if(i<n)
                stack.push(idx);
        }
        return ans;
    }

}
