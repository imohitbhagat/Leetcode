//Bruteforce approach

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len = nums1.length+nums2.length;
        int i =0;
        int j =0;
        int k =0;
        
        double [] mergedArray = new double[len];
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                mergedArray[k] = nums1[i];
                i++;
                k++;
            }else{
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }
        
        while(i<nums1.length){
           mergedArray[k] = nums1[i];
                i++;
                k++; 
        }
        while(j<nums2.length){
            mergedArray[k] = nums2[j];
                j++;
                k++;
        }
        
        double median = 0.0;
        int middle = (mergedArray.length)/2;
        
        if(mergedArray.length%2 ==0){
            median = (mergedArray[middle]+mergedArray[middle-1])/2;
        }else{
            median = mergedArray[middle];
        }
        return median;
    }
}


// Optimized approach

class Solution {
  public static double findMedianSortedArrays(int arr1[],int arr2[]) {
      
     int m = arr1.length;
     int n = arr2.length;
        if(m>n)
            return findMedianSortedArrays(arr2,arr1);//ensuring that binary search happens on minimum                                                   size array

        int low=0,high=m,medianPos=((m+n)+1)/2;
        while(low<=high) {
            int cut1 = (low+high)>>1;
            int cut2 = medianPos - cut1;

            int l1 = (cut1 == 0)? Integer.MIN_VALUE:arr1[cut1-1];
            int l2 = (cut2 == 0)? Integer.MIN_VALUE:arr2[cut2-1];
            int r1 = (cut1 == m)? Integer.MAX_VALUE:arr1[cut1];
            int r2 = (cut2 == n)? Integer.MAX_VALUE:arr2[cut2];

            if(l1<=r2 && l2<=r1) {
                if((m+n)%2 != 0)
                    return Math.max(l1,l2);
                else 
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high = cut1-1;
            else low = cut1+1;
        }
        return 0.0;
    }
}
