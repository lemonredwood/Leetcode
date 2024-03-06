class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for(String c:tokens){
            if(c.equals("*")){
                int y = st.pop();
                int x = st.pop();
                st.push(x*y);
            }
            else if(c.equals("/")){
                int y = st.pop();
                int x = st.pop();
                st.push(x/y);
            }
            else if(c.equals("-")){
                int y = st.pop();
                int x = st.pop();
                st.push(x-y);
            }
            else if(c.equals("+")){
                int y = st.pop();
                int x = st.pop();
                st.push(x+y);
            }
            else st.push(Integer.parseInt(c));
        }
        return st.pop();
    }
}

