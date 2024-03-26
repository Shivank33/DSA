//     Additive Sequence    (GeeksforGeeks)



class Solution {
    public boolean isAdditiveSequence(String n) {
        int first = 0;
        int m = n.length();
        for(int i = 0 ; i < m - 2 ; i++)
        {
            first = (first*10)+(int)(n.charAt(i) - '0');
            int second = 0;
            for(int j = i + 1 ; j < m - 1 ; j++)
            {
                second = (second*10) + (int)(n.charAt(j) - '0');
                int m1 = first , m2 = second;
                int third = 0 , k = 0;
                for(k = j + 1 ; k < m ; k++)
                {
                    third = (third*10) + (int)(n.charAt(k) - '0');
                    if(third == (m1 + m2))
                    {
                        m1 = m2;
                        m2 = third;
                        third = 0;
                    }
                }
            
            if(k == m && third == 0) return true;
            }
        }
        return false;
    }
}
