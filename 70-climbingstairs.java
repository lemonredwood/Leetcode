class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
        List<Integer> ll = new ArrayList();
        int i = 0;
        ll.add(1);
        ll.add(2);
        while(i+2<n){
            int x = ll.get(ll.size()-1);
            int y = ll.get(ll.size()-2);
            ll.add(x+y);
            i++;
        }
        return ll.get(ll.size()-1);
    }
}
