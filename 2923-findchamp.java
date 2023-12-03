class Solution {
    public int findChampion(int[][] grid) {
        int i=0;
        while(i<grid.length){
            int sum = 0;
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
            }
            if(sum==grid[i].length-1)return i;
            i++;
        }
        return -1;
    }
}
