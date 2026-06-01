class KthLargest {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k = 0;
    int nums[];

    public KthLargest(int k, int[] nums) {
       this.k = k;
       for(int i =0; i<nums.length; i++){
            if(minHeap.size()== k){
                if(minHeap.peek() < nums[i]){
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
            else{
                minHeap.add(nums[i]);
            }
       }
    }
    
    public int add(int val) {
        if(minHeap.size() == k){
                if(minHeap.peek() < val){
                    minHeap.poll();
                    minHeap.add(val);
                }
            }
            else{
                minHeap.add(val);
            }
            return minHeap.peek();
    }
}
