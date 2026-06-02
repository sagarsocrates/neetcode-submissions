class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prodArray[] = new int[n];
        prodArray[0] = nums[0];
        for(int i=1;i<n;i++){
            prodArray[i] = prodArray[i-1] * nums[i];
        }

        int revArray[] = new int[n];
        revArray[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            revArray[i] = revArray[i+1] * nums[i];
        }

        int ans[] =new int[n];
        ans[0]= revArray[1];
        ans[n-1] = prodArray[n-2];

        for(int i=1;i<n-1;i++){
            ans[i]=prodArray[i-1] * revArray[i+1];
        }
        return ans;

    }
}  
