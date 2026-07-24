package binarysearch;

// https://leetcode.com/problems/first-bad-version/
// Find First True / Boundary Search
public class FirstBadVersion {
	
	public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while(left<right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
