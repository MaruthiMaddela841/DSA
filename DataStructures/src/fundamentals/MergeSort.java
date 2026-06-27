package fundamentals;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr=new int[] { 7, 3, 2, 16, 24, 4, 11, 9 };
		mergeSort(arr,0,7);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

	private static void mergeSort(int[] arr,int start, int end) {

		if(start==end) {
			return;
		}
		int mid=(start+end)/2;//int mid = start + (end - start) / 2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1, end);
		merge(arr,start,mid,end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int[] temp = new int[end - start + 1];
		
		int left=start;
		int right=mid+1;
		int i=0;
		while(left<=mid && right<=end) {
			if(arr[left]<arr[right]) {
				temp[i]=arr[left];
				i++;
				left++;
			}else {
				temp[i]=arr[right];
				right++;
				i++;
			}
		}
		while(left<=mid) {
			temp[i]=arr[left];
			i++;
			left++;
		}
		while(right<=end) {
			temp[i]=arr[right];
			i++;
			right++;
		}
		for(int j=start;j<=end;j++) {
			arr[j]=temp[j-start];
		}
	}
}
