//   Find the N-th character   (GeeksforGeeks)


class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        
        for(int i = 0; i < r ; i++){
            
            String s2 = "";
            
            for(int j =0 ; j < s.length() ; j++){
                
            if(s.charAt(j) == '1'){
                s2 += "10";
            }
            
            if(s.charAt(j) == '0'){
                s2 += "01";
            }
            
            if(s2.length() > s.length())  break;
            
            }
            s=s2;
        
        }
        return s.charAt(n);
    }
}
