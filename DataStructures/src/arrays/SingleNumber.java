package arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number/description/
public class SingleNumber {

	public static void main(String[] args) {
		
		singleNumber(new int[] {4,1,2,1,2});

	}
	
	public static int singleNumber(int[] nums) {

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                result=entry.getKey();
            }
        }
        return result;
    }

}
