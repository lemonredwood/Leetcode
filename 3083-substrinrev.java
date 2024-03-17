class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i=0;i<s.length()-1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            if(s.contains(""+c1+c2) && s.contains(""+c2+c1))return true;
        }
        return false;
    }
}
