//   Remove all duplicates from a given string   (GeeksforGeeks)


class Solution {
    String removeDuplicates(String str) {
        
        String s="";

         LinkedHashSet<Character> set = new LinkedHashSet<Character>();

            for(int i = 0; i < str.length(); i++){
                set.add(str.charAt(i));
            }

           for(char ch:set){
               s+=ch;
           }

        return s; 
    }
}
