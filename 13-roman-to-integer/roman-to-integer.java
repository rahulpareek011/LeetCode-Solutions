class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp2 = new HashMap<>();
        mp2.put('I',1);
        mp2.put('V',5);
        mp2.put('X',10);
        mp2.put('L',50);
        mp2.put('C',100);
        mp2.put('D',500);
        mp2.put('M',1000);
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            int currNum = mp2.get(s.charAt(i));
            int nextNum = mp2.get(s.charAt(i+1));
            if(currNum<nextNum){
                sum-= currNum;
            }else{
                sum+= currNum;
            }
        }
        sum+=mp2.get(s.charAt(s.length()-1));
        return sum;
    }
}