class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        
        int n = strs.length;
        for(int i=0; i<n; i++){
            String key = calculateKey(strs[i]);
            if(result.containsKey(key)){
                List<String> list = result.get(key);
                list.add(strs[i]);
                result.put(key,list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                result.put(key,list);
            }
        }
        List<List<String>> answer = new ArrayList<>();

        for(String key: result.keySet()){
                answer.add(result.get(key));
        }
        return answer;
        
    }

    public String calculateKey(String str){
        int count[] = new int[26];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            count[c - 'a']+=1;
        }
        String res= "";
        for(int i=0; i<26; i++){
            res+= count[i]+(char)('a' + i);
        }
        return res;
    }
}
