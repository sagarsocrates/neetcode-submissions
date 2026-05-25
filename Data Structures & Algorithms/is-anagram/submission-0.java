class Solution {
    public boolean isAnagram(String s, String t) {
        int srcArr[] = new int[26];
        int dstArr[] = new int[26];
        if(s.length() != s.length()) return false;

        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            srcArr[c - 'a']+=1;
        }

        for(int i=0;i<t.length(); i++){
            char c = t.charAt(i);
            dstArr[c - 'a']+=1;
        }

        for(int i=0;i<26; i++){
            if(srcArr[i]!= dstArr[i]) return false;
        }
        return true;
    }
}
