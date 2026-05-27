class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int n = s.length();
        for(char c: s.toCharArray()){
            if(c == '{') 
                stack.push('}');
            else if(c == '(') 
                stack.push(')');
            else if(c == '[')
                stack.push(']');
            else{
                if(stack.isEmpty() || stack.pop()!= c )
                    return false;
                }
        }
        return stack.isEmpty();

    }
}
