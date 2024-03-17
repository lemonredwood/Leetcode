class Solution {
    public long countSubstrings(String s, char c) {
        long n=0;
        for(int i=0;i<s.length();i++) if(s.charAt(i)==c) n++;
        long ans = (long)((n*n)+n)/2;
        return ans;
    }
}
