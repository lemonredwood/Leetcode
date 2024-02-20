//Brute force method

class Solution {
    public boolean binarySearch(int nums[], int left, int right, int target){
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target)return true;
            else if(target>nums[mid])left=mid+1;
            else if(target<nums[mid])right=mid-1;
        }
        return false;
    }
    public int partition(int nums[],int left, int right){
        int pivot = nums[right];
        int i = left-1;
        for(int j=left;j<=right;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1]=nums[right];
        nums[right]=temp;
        return i+1;
    }
    public void quicksort(int nums[], int left, int right){
        if(left<=right){
            int pi = partition(nums,left,right);
            quicksort(nums,left,pi-1);
            quicksort(nums,pi+1,right);
        }
    }
    public int missingNumber(int[] nums) {
        int i=0;
        int len = nums.length;
        boolean x=true;
        quicksort(nums,0,nums.length-1); 
        while(x){
            x = binarySearch(nums,0,len-1,i);
            if(x)i++;
            else return i;
        }
        return -1;
    }
}



//Smart solution


class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        int total = (n*(n+1))/2;
        return total-sum;
    }
}
