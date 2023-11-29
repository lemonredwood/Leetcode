class Solution {
    public boolean check(int[][] arr1, int[][]arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if (arr1[i][j]!=arr2[i][j]) return false;
            }
        }
        return true;
    }
    public int[][] clone(int[][] arr){
        int[][] newarr = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                newarr[i][j] = arr[i][j];
            }
        }
        return newarr;
    }
    public boolean areSimilar(int[][] mat, int k) {
        int newmat[][] = clone(mat);
        for(int x=0;x<k;x++){
            for(int i=0;i<newmat.length;i++){
                if(i%2==0){
                    int temp = newmat[i][newmat[i].length-1];
                    for(int j=(newmat[i].length-2);j>=0;j--){
                        newmat[i][j+1] = newmat[i][j];
                    }
                    newmat[i][0] = temp;
                }
                else{
                    int temp = newmat[i][0];
                    for(int j=0;j<newmat[i].length-1;j++){
                        newmat[i][j] = newmat[i][j+1];
                    }
                    newmat[i][newmat[i].length-1] = temp;
                }
            }
        }
        return check(mat,newmat);
    }
}