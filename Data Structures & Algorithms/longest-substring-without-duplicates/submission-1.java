class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right<s.length()){

            char c= s.charAt(right);

            if(map.containsKey(c)){
                left = Math.max(left,map.get(c)+1);
                
            }
            
            map.put(c,right);   
            maxLength = Math.max(maxLength,right-left+1);
            right = right+1; 
        }
        return maxLength;
    }
}
