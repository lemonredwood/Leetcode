class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int sl = s.length();
        int tl = t.length();
        while(i<tl && j<sl){
            if(s.charAt(j)==t.charAt(i++))j++;
        }
        if(j==sl)return true;
        return false;
    }
}
