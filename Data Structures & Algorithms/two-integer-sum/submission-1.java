class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n; i++){
            int src = target-nums[i];
            if(map.containsKey(src)){
                int a = map.get(src);
                int b = i;
                return new int[]{a,b};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
