class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i:nums){
            if(visited[i]) return i;
            visited[i]=true;
        }
        return 0;
    }
}
