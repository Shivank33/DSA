// Search Pattern (Rabin-Karp Algorithm)   (GeeksforGeeks)


class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        ArrayList<Integer> List = new ArrayList<>();
        
        int n = pattern.length();
        
        for(int i = 0 ; i < text.length() - n +1 ; i++){
            
            String temp = text.substring(i , n+i);
            
            if(temp.equals(pattern)){
                List.add(i+1);
            }
        }
        return List;
    }
}
