class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=0;
        int y=0;
        int i=0;
        int[] ans = new int[m+n];
        while(x<m && y<n){
            if(nums1[x]<nums2[y])ans[i++]=nums1[x++];
            else ans[i++]=nums2[y++];
        }
        while(x<m){
            ans[i++]=nums1[x++];
        }
        while(y<n){
            ans[i++]=nums2[y++];
        }
        for(int j=0;j<m+n;j++)nums1[j]=ans[j];
    }
}
