package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= new int[]{1,6,8,23,67,98};
		int k=2;
		System.out.println(binarySearch(arr, k));
	}
	
	public static int binarySearch(int[] args, int k) {
		int left=0;
		int right=args.length;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(args[mid]==k) return mid;
			if(args[mid]<k) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}

}
