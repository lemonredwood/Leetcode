class Solution {
    public String reverseWords(String s) {
        String ans = "";
        s=s.trim();
        int i = 0;
        while(i<s.length()){
            String temp = "";
            while(s.charAt(i)==' '){
                i++;
                if(i==s.length())break;
            }
            while(s.charAt(i)!=' '){
                temp+=s.charAt(i);
                i++;
                if(i==s.length())break;
            }
            ans=temp+' '+ans;
        }
        return ans.trim();    
    }
}
