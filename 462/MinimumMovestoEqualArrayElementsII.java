class Solution {
    public int minMoves2(int[] nums) {
        
       int count =0;
	        Arrays.sort(nums);
	        
	        int mid = nums[nums.length/2];
	        
	        for (int i :nums) {
	        	count = count + Math.abs(i-mid);
	        }
	        
	        return count;
    }
}
