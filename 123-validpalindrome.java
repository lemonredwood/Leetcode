class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(Character.isLetterOrDigit(x)){
                str+=x;
            }
        }
        int front = 0;
        int rear = str.length()-1;
        while(front<rear){
            if(str.charAt(front)==str.charAt(rear)){
                front++;
                rear--;
            }
            else return false;
        }
        
        return true;
    }
}
