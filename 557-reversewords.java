class Solution {
    public String reverseWords(String s) {
        StringBuffer word = new StringBuffer();
        for(String i:s.split(" ")){
            StringBuffer sb = new StringBuffer();
            sb.append(i);
            word.append(sb.reverse()+" ");
        }
        return word.toString().trim();
    }
}
