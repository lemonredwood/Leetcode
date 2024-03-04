//My partial solution(32/46):
class Solution {
    public int evaluate(int a,int b,int flag){
        if(flag==0){
            System.out.println("add:"+a+b);
            return a+b;
        }
        else if(flag==1){
            System.out.println("sub:"+(a-b));
            return a-b;
        }
        else{
            System.out.println("upgrad:"+(10*a+b));
            return (10*a)+b;
        }
    }
    public boolean isDigit(char c){
        if(c>='0' && c<='9')return true;
        return false;
    }
    public boolean isOperator(char c){
        if(c=='+' || c=='-'){
            System.out.println("yay");
            return true;
        }
        return false;
    }
    public int calculate(String s) {
        s=s.trim();
        int count=0;
        int sign = 0;
        char p = '+';
        char m = '-';
        Stack<Integer> st = new Stack();
        st.push(0);
        Stack<Character> op = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isDigit(c)){
                count++;
                int y = Integer.parseInt(c+"");
                st.push(y);
                if(i<s.length()-1){
                    if(isDigit(s.charAt(i+1))){
                        if(!op.isEmpty()){
                            int x = st.pop();
                            char nop = op.peek();
                            int r = evaluate(x,y,2);
                            st.push(r);
                            op.push(nop);
                            continue;
                        }
                    }
                }
                if(!op.isEmpty()){
                    st.pop();
                    int x = st.pop();
                    char o = op.pop();
                    if(o=='+'){
                        int a = evaluate(x,y,0);
                        st.push(a);
                    }
                    else if(o=='-'){
                        int a = evaluate(x,y,1);
                        st.push(a);
                    }
                }
            }
            else if(sign==1 && (c!=')' && c!='(' && c!=' ')){
                if(!op.isEmpty())op.pop();
                if(c=='+')op.push(m);
                else op.push(p);
            }
            else if(sign==0 && (c!=')' && c!='(' && c!=' ')){
                if(c=='+')op.push(p);
                else op.push(m);
            }
            else if(c=='('){
                if(!op.isEmpty()){
                    if (op.peek()=='-' && sign==0)sign = 1;
                    else if (op.peek()=='+' && sign==0)sign = 0;             
                }
            }
            else if(c==')')sign=0;
            System.out.println(st);
            System.out.println(op);
        }           
        if(count==s.length()){
            int ans = Integer.parseInt(s);
            return ans;
        }
        if(!op.isEmpty()){
            if(op.peek()=='-')return -1*st.pop();
        }
        return st.pop();
    }
}


//Actual Solution

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        s = s.replaceAll("\\s+", ""); // Remove whitespaces
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int result = 0;
        int sign = 1; // 1 for positive, -1 for negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop(); // Previous sign
                result += stack.pop(); // Previous result
            }
        }

        result += sign * num;
        return result;
    }
}

