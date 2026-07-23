package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-i/
// Next Greater Element I
public class NextGreaterElementi {
	
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        Stack<Integer> stack=new Stack<>();
	        Map<Integer,Integer> map=new HashMap<>();
	        int[] res=new int[nums1.length];
	        for(int n:nums2){
	            while (!stack.isEmpty() && stack.peek() < n) {
	                map.put(stack.pop(), n);
	            }
	            stack.push(n);
	        }
	        for(int i=0;i<nums1.length;i++){
	            res[i]=map.getOrDefault(nums1[i], -1);
	        }
	        return res;
	    }

}
