// Swap the array elements   (GeeksforGeeks)


class Solution
{
    public void swapElements(int[] arr, int n)
    {
        int count = 0;
        for(int i=0 ; i < n-2 ; i++){
            count = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = count;
        }
    }
}
