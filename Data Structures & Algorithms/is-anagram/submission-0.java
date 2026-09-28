class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }


        HashMap<Character , Integer> temp1 = new HashMap<>();
        HashMap<Character , Integer> temp2 = new HashMap<>();       


        for(int i = 0 ; i<s.length();i++){
            temp1.put(s.charAt(i),temp1.getOrDefault(s.charAt(i),0)+1);
            temp2.put(t.charAt(i),temp2.getOrDefault(t.charAt(i),0)+1);

        }
        return temp1.equals(temp2);


    }
}
