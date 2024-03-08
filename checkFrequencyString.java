//  Check if frequencies can be equal   (GeeksforGeeks)


class Solution {
    boolean sameFreq(String s) {
        
    Map<Character, Integer> mp  = new HashMap<>();
   
    int mf=0;
    for(int i=0;i<s.length();i++){
         mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
         mf=Math.max(mf,mp.get(s.charAt(i)));
     }
     
     int c=0;
     for(int i:mp.values()){
         
         if(mf-i>1)return false;
         if(mf==i)c++;
     }
     
     if(c>1 && c<mp.size())return false;
     return true;
    }
}
