// Maximum Index   (GeeksforGeeks)

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        int i=0;
        int j=n-1;
        int max=0;
        
        while(i<n)
        {
            if(a[i]>a[j])
            {
                j--;
            }
            else
            {
                max=Math.max(max,j-i);
                i++;
                j=n-1;
            }
        }
        return max;
        
    }
}
