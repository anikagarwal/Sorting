// SortTools.java 

package assignment1;
public class SortTools {
	/**
	  * This method tests to see if the given array is sorted.
	  * @param x is the array
	  * @param n is the size of the input to be checked
	  * @return true if array is sorted
	  */
	public static boolean isSorted(int[] x, int n) {
		for(int i=0; i<n-1; i++) {
			if(x[i] > x[i+1]) {
				return false;
			}
		}
		return true;
	}
	 public static int find(int[] nums, int n, int v) { //if v is in first n of x, return v's index if not return -1
		 for(int i=0; i<n; i++) {
			 if(nums[i] == v) {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	 public static int[] insertGeneral(int[] nums, int n, int v) { //return new int array w/ 1st n of nums and v in increasing order 
		 int ind = 0;
		 if(find(nums, n, v) != -1) { //if v in n
			 int[] ans1 = new int[n];
			 ans1 = nums;
			 return ans1;
		 }
		 else {
			 ind = n+1;
		 }
		 
		 int[] ans = new int[ind];
		 
		 int i=0;
			 while(nums[i] < v) {
				 ans[i] = nums[i];
				 i++;
			 }
			 
			 //i++;
			 ans[i] = v;
			 i++;
			 
			 while(i<n+1) {
				 ans[i] = nums[i-1];
				 i++;
			 }
			 
		 return ans;
	 }
	 
	 public static int insertInPlace(int[] nums, int n, int v) {
		 int ind = n+1;
		 if(find(nums, n, v) != -1) {
			 return n;
		 }
		 
		 int i=0;
		 int place = 0;
			 while(nums[i] < v) {
				 i++;  //cycle until v should be inserted
			 }
			 
			 place = i;
			 i++;
			 
			 while(i<n-1) {
				 nums[i+1] = nums[i];
				 i++;
			 }
			 
			 nums[place] = v;
			 
		 return ind;
	 }
	 
	 void insertSort(int[] nums, int n) {
		 
	 }
}
