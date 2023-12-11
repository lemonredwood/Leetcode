class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = 0;
        int number = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
                if(count>=arr.length/4)number = arr[i];
            }
            else count=1;
        }
        return number;
    }
}
