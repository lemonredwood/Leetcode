class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int i = citations.length-1;
        while(i>=0){
            if(citations[i--]>h)h++;
        }
        return h;
    }
}
