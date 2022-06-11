class Solution {
    public int minOperations(int[] nums, int x) {
    int n=nums.length;
    int sum=0;
    for(int element:nums)
      sum+=element;
    int maxLength=-1;
    int currSum=0;
    for(int start=0,end=0;end<n;end++){
        currSum+=nums[end];
        
        while(start<=end && currSum>sum-x)
            currSum -= nums[start++];
        
        if(currSum==sum-x)
         maxLength=Math.max(maxLength,end-start+1);
    }
    if(maxLength==-1)
        return -1;
    else
        return n-maxLength;
}
    
}
