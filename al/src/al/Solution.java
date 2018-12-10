package al;


public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    
	    int m = 0; 
	    int n = 0; 
	    
	     int length = nums1.length+nums2.length;
	     int[] result = new int[length/2+1];
	     
	     for (int i = 0;i <= length/2;i++) {   	 
	    	
	    	 if ((m == nums1.length) ||(nums1.length == 0)) {
	    		 result[i] = nums2[n];
	    		 n++;
	    	 }
	    	 else if  ((n == nums2.length) ||(nums2.length == 0)) {
	    		 result[i] = nums1[m];
	
	    		 m++;
	    	 } else {
	    		 if  (nums1[m] > nums2[n]){
		    		 result[i] = nums2[n];
		    		 n++;
		    	 }
		    	 else {
		    		 result[i] = nums1[m];
		
		    		 m++;
		    	 }
		     }}
	     if (length%2 == 0) {
	    	 return ((double)result[length/2]+(double)result[length/2-1])/2;
	     } else {
	    	 return (double)result[length/2];
	     }
	     
	   
	    }
	


}
