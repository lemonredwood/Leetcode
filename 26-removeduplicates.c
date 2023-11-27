int removeDuplicates(int* nums, int numsSize) {
    int unique = 1;
    int iterator = 1;
    int k=1;
    for(int i=1;i<numsSize;i++){
        if(nums[i]>nums[i-1]){
            nums[unique] = nums[iterator];
            unique++;
            iterator++;
            k++;
        }
        else iterator++;
    }
    return k;
}