class Solution {
    public int maximumUniqueSubarray(int[] nums) {

    		int left=0;
	    	int right = 0;
	        int max = 0;
	        int sum=0;
	    
	        Set<Integer> set = new HashSet<Integer>();
	        
	       while(right<nums.length) {
	    	   if(set.add(nums[right])) {
	    		   sum += nums[right];
	    		   max = Math.max(max, sum);
	    		   right++;
	    	   }else {
	    		   int DelEl=nums[left];
	               set.remove(DelEl);
	    		   sum -= nums[left];
	    		   left++;
	    	   }
	       }
	        
			return max;
    }
}
