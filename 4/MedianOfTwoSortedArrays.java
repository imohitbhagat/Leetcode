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
