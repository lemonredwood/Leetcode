class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='(' || c == '{' || c == '[')st.push(c); 
            else if(!st.isEmpty() && c =='}' && st.peek()=='{')st.pop();
            else if(!st.isEmpty() && c ==']' && st.peek()=='[')st.pop();
            else if(!st.isEmpty() && c ==')' && st.peek()=='(')st.pop();
            else if(st.isEmpty() && c =='}' || c ==']' || c ==')')return false;
            else return false;
        }
        if(st.isEmpty())return true;
        else return false;
    }
}
