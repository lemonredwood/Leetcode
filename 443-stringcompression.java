class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)return 1;
        int x=0;
        int i=0;
        while(i<chars.length){
            chars[x++]=chars[i];
            int j=i+1;
            if(i==chars.length-1)break;
            if(chars[i]!=chars[j]){
                i++;
                continue;
            }
            while(j<chars.length){
                if(chars[j]==chars[i])j++;
                else break;
            }
            int rem = j-i;
            String srem = Integer.toString(rem);
            for(int k=0;k<srem.length();k++)chars[x++]=srem.charAt(k);
            i=j;
        }
        return x;
    }
}
