//   Count pairs Sum in matrices   (GeeksforGeeks)


class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int count = 0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                set.add(mat1[i][j]);
            }
        }
        
        for(int i=n-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(set.contains(x-mat2[i][j])){
                    count++;
                }
            }
        }
        return count;
    }
}
