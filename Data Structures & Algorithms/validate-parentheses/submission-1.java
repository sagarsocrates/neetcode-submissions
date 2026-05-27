class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()){
                    char poppedChar = stack.pop();
                
                    if(poppedChar == '{' && c!= '}') return false;
                    if(poppedChar == '[' && c!=']') return false;
                    if(poppedChar == '(' && c!=')') return false;
                }
                else{
                    return false;
                }
                
            }
        }
        return stack.isEmpty();

    }
}
