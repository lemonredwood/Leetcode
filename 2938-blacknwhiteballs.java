class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long zerocounter = 0;
        for(int i=s.toCharArray().length-1;i>=0;i--){
            if(s.charAt(i)=='0')zerocounter++;
            else count+=zerocounter;
        }
        return count;
    }
}
