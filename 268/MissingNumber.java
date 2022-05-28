class Solution {
    public int missingNumber(int[] nums) {
       
        int sum = 0;
        int result = 0;
        int total = (nums.length * (nums.length +1))/2;
        
        for(int i=0; i<=nums.length-1; i++){
           sum = sum + nums[i];
        }
        result = total-sum;
        
        return result;
    }
}
