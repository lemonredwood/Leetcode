class Solution {
    public String longestCommonPrefix(String[] strs) {
        int flag = 0;
        int count = 0;
        String ans = "";
        while(flag==0){
            if(count<strs[0].length()){
                char key = strs[0].charAt(count);
                for(int i=0;i<strs.length;i++){
                    if(strs[i].length()<=count){
                        flag=1;
                        break;
                    }
                    else if(strs[i].charAt(count)!=key){
                        flag=1;
                        break;
                    }
                }
                count++;
                if(flag==0)ans+=key;
            }
            else flag=1;
        }
        return ans;
    }
}
