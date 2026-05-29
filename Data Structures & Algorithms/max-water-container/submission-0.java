class Solution {
    public int maxArea(int[] heights) {
        int maxLeft = 0;
        int maxRight = heights.length-1;
        int area = 0;
        while(maxLeft<maxRight){
            area = Math.max(
                area,
                Math.min(heights[maxLeft], heights[maxRight]) * (maxRight - maxLeft)
            );
            if(heights[maxLeft]< heights[maxRight]){
                maxLeft++;
            }
            else{
                maxRight--;
            }
        }
        return area;
    }
}
