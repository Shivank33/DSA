// Peak element  (GeeksForGeeks)

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        if(n==0){
            return 0;
        }
       int left =0;
       int right =n-1;
       while(left<right){
           int mid=left+(right-left)/2;
       if(arr[mid]>=arr[mid+1])
         right=mid;
         else 
         left=mid+1;
       
    }
    return left;
   }
}
