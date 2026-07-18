package strings;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/reorganize-string
public class ReorganizeString {

	public static void main(String[] args) {
		
		System.out.println(reorganizeString("aaab"));

	}
	
	public static String reorganizeString(String s) {
		PairComparator pc= new PairComparator();
		Queue<Pair> q=new PriorityQueue<>(pc.reversed());
		int[] freq=new int[26];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			freq[c-'a']++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				q.offer(new Pair((char) (i+'a'),freq[i]));
			}
		}
		Pair prev=null;
		while(!q.isEmpty()) {
			Pair current=q.poll();
			sb.append(current.ch);
			current.freq--;
			if(prev!=null && prev.freq>0) {
				q.offer(prev);
			}
			prev=current;
		}
		
		if (sb.length() != s.length()) return "";
		
		return sb.toString();
	    
	}

}

class Pair {
    char ch;
    int freq;
	public Pair(char ch, int freq) {
		super();
		this.ch = ch;
		this.freq = freq;
	}
	@Override
	public String toString() {
		return "Pair [ch=" + ch + ", freq=" + freq + "]";
	}
    
}

class PairComparator implements Comparator<Pair>{

	@Override
	public int compare(Pair o1, Pair o2) {
		return Integer.compare(o1.freq, o2.freq);
	}
	
}
