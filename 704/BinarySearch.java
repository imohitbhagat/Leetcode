//iterative approach

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int result = -1;
        
        while(left<=right){
            int mid = (left + right) /2;
            
            if(nums[mid] == target){
                return mid;
            }
        
            if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return result;
    }
}


//recursive approach

class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int result = -1;
        
        return searchNumber(nums,target,left,right);
    }
    
    int searchNumber(int[] nums, int target, int left, int right){
   
    while(left<=right){
            int mid = (left + right) /2;
            
            if(nums[mid] == target){
                return mid;
            }
        
            if(nums[mid] > target){
               return searchNumber(nums,target,left,mid-1);
            }else{
               return searchNumber(nums,target,mid+1,right);  
            }
        }
        return -1;
}
}
