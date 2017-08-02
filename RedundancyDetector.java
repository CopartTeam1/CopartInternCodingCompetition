/**
 * 
 * @author Prasad Kudtarkar
 * 
 * Method overloading
 * Dynamic Programming
 * 
 */

import java.util.*;

public class RedundancyDetector {
	
	private static String longestcommonSubstring(String s) {
		int[][] a = new int[s.length()][s.length()];
		int max = 0;
		int x = 0;
		for(int i=0; i<=s.length(); i++) {
			for(int j=i+1; j<=s.length()-1; j++) {
				if(s.charAt(i) == s.charAt(j)) {
					if(i>0) {
						a[i][j] = a[i-1][j-1] + 1;
					}
					else
						a[i][j] = 1;
				}
			}
		}
		for(int i=0; i<=s.length()-1; i++) {
			for(int j=0; j<=s.length()-1; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					x = i;
				}
			}
		}
		
		if(max>0) {
			char[] ans = new char[max];
			for(int i=max-1; i>=0; i--) {
				ans[i] = s.charAt(x);
				x--;
			}
			String answer = new String(ans);
			return answer;
		}
		
		return "";
		
	}
	
	private static String longestcommonSubstring(String s1, String s2) {
		int[][] a = new int[s1.length()][s2.length()];
		int max = 0;
		int x = 0;
		for(int i=0; i<=s1.length()-1; i++) {
			for(int j=0; j<=s2.length()-1; j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					if(i>0 && j>0) {
						a[i][j] = a[i-1][j-1] + 1;
					}
					else
						a[i][j] = 1;
				}
			}
		}
		for(int i=0; i<=s1.length()-1; i++) {
			for(int j=0; j<=s2.length()-1; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					x = i;
				}
			}
		}
		
		if(max>0) {
			char[] ans = new char[max];
			for(int i=max-1; i>=0; i--) {
				ans[i] = s1.charAt(x);
				x--;
			}
			String answer = new String(ans);
			return answer;
		}
		
		return "";
		
	}
	


	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		String s1 = kbd.nextLine();
		String s2 = kbd.nextLine();
		String s = kbd.nextLine();
		long startTime = System.nanoTime();
		System.out.println(longestcommonSubstring(s1,s2));
		System.out.println(longestcommonSubstring(s));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		//Took 217591 ns in total for both the parts

	}
	
	

}
