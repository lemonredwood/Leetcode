class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int greater[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            while(j<nums2.length){
                if(nums1[i]<nums2[j]){
                    greater[i] = nums2[j];
                    break;
                }
                greater[i]=-1;
                j++;
            }
        }
        return greater;           
    }
}