class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> roman = new LinkedHashMap<>();
        roman.put(1000, "M");
        roman.put(900, "CM");
        roman.put(500, "D");
        roman.put(400, "CD");
        roman.put(100, "C");
        roman.put(90, "XC");
        roman.put(50, "L");
        roman.put(40, "XL");
        roman.put(10, "X");
        roman.put(9, "IX");
        roman.put(5, "V");
        roman.put(4, "IV");
        roman.put(1, "I");
        String ans = new String();
        Iterator it = roman.entrySet().iterator();
        System.out.println(roman);
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            int key = (int)pair.getKey();
            String val = (String)pair.getValue();
            System.out.println(key);
            while(num>=key){
                ans+=val;
                num-=key;
            }
        }
        return ans;
    }
}
