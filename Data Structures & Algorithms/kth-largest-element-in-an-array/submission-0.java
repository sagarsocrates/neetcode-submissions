class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                if(num > minHeap.peek()){
                    minHeap.poll();
                }
                else{
                    minHeap.remove(num);
                }
                
            }
        }
        return minHeap.poll();
    }
}
