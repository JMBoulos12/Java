




/*
  Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
  The overall run time complexity should be O(log (m+n)).
  
  Example 1:
  Input: nums1 = [1,3], nums2 = [2]
  Output: 2.00000
  Explanation: merged array = [1,2,3] and median is 2.
  
  Example 2:
  Input: nums1 = [1,2], nums2 = [3,4]
  Output: 2.50000
  Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
  
  Constraints:
  nums1.length == m
  nums2.length == n
  0 <= m <= 1000
  0 <= n <= 1000
  1 <= m + n <= 2000
  -106 <= nums1[i], nums2[i] <= 106 
  
  29-January-2023
*/

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m = nums1.length;
    int n = nums2.length;
    int a[] = new int[m+n];
    int i = 0, j=0, k=0;
    while(i<m&&j<n)
    {
      if (nums1[i]<nums2[j])
      {
        a[k]=nums1[i];
        i++;
      } 
      else{
        a[k]=nums2[j];
        j++;
      }
      k++;
    }
    while(i<m){
      a[k]=nums1[i];
      i++;
      k++;
    }
    while(j<n){
      a[k]=nums2[j];
      j++;
      k++;
    }
    if((m+n)%2!=0){
      return a[(m+n)/2];
    }
    else{
      int x =(m+n)/2;
      double p =a[x];
      double q=a[x-1];
      return(p+q)/2;
    }
  }
}
