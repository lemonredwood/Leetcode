class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hm = new HashMap();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else hm.put(ch,1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
                if(hm.get(ch)==-1)return false;
            }
            else return false;
        }
        return true;
    }
}
