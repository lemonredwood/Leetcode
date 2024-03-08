class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        StringBuilder ans = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int min = Math.min(l1,l2);
        while(i<min){
            ans.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(min<l1){
            ans.append(word1.substring(min));
        }
        if(min<word2.length()){
            ans.append(word2.substring(min));
        }
        return ans.toString();
    }
}
