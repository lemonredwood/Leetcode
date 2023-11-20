#include<stdio.h>
void swap(int* a,int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
int parent(int* nums, int index){
    return (index+1)/2 -1;
}
int leftchild(int* nums, int index){
    return 2*(index+1)-1;
}
int rightchild(int* nums, int index){
    return 2*(index+1);
}
void insert(int* nums,int numsSize,int data){
    for(int i=numsSize-1;i>=0;i--){
        if(nums[i]>nums[parent(nums,i)]){
            swap(&nums[i],&nums[parent(nums,i)]);
        }
    }
}
// int* delete(int* nums, int numsSize){

// }
// int findKthLargest(int* nums, int numsSize, int k) {
//     for(int i=numsSize;i>=0;i--){
//         insert(nums,i,nums[i]);
//         printf("%d",nums[i]);
//     }

//     return 1;
// }
int main(){
    int arr[]={2,5,4,7,6,1};
    swap(&arr[0],&arr[1]);
    for(int i=0;i<6;i++){
        printf("%d",arr[i]);
    }

}