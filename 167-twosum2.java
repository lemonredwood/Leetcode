class Solution {
    public int binarySearch(int[] nums,int i1,int last, int target){
        if(i1<=last){
            int mid = i1 + (last-i1)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target) return binarySearch(nums,i1,mid-1,target);
            else return binarySearch(nums,mid+1,nums.length-1,target);
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = {-1,-1};
        for(int i1=0;i1<numbers.length;i1++){
            int i2 = binarySearch(numbers,i1+1,numbers.length-1,target-numbers[i1]);
            System.out.println(i2);
            if(i2!=-1){
                ans[0] = i1+1;
                ans[1] = i2+1;
                break;
            }
            else continue;
        }
        return ans;
    }
}


// Better Efficient Solution

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int ans[] = new int[2];
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }
            else if(numbers[l]+numbers[r]>target)r--;
            else l++;
        }
        return ans;
    }
}
