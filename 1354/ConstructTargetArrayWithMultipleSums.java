class Solution {
    public boolean isPossible(int[] target) {
        long sum =0;
        
        PriorityQueue<Long> maxHeap = new PriorityQueue<Long>(Collections.reverseOrder());
        
        for(int t:target){
            sum += t;
            maxHeap.offer((long)t);
        }
        
        while(maxHeap.peek() !=1){
            long max = maxHeap.poll();
            sum = sum-max;
            if(sum <=0 || sum >=max){
                return false;
            }
            max = max%sum;
            
            sum = sum + max;
            maxHeap.offer(max>0?max:sum);
            }
        return true;
    }
}
