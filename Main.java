/* 
 * This file is how you might test out your code.  Don't submit this, and don't 
 * have a main method in SortTools.java.
 */

package assignment1;
public class Main {
	public static void main(String [] args) {
		int[] x={0,1};
		int n;
		int v;
		n = 2;
		v = 1;
		
		//System.out.println(SortTools.isSorted(x, n));
		//System.out.println(SortTools.find(x, n, v));
		System.out.println(SortTools.insertGeneral(x, n, v));
		System.out.println(SortTools.insertInPlace(x, n, v));
	}
}
