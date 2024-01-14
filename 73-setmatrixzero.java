class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> xind = new ArrayList();
        List<Integer> yind = new ArrayList();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(!xind.contains(i))xind.add(i);
                    if(!yind.contains(j))yind.add(j);
                }
            }
        }
        for(int i:xind){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=0;
            }
        }
        for(int j:yind){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=0;
            }
        }
    }
}
