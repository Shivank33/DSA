//    Print N-bit binary numbers having more 1s than 0s     (GeeksforGeeks)



class Solution {
    void helper(int N,ArrayList<String> myList,String currString,int val1,int val0){
        if(val1+val0==N){
            myList.add(currString);
            return;
        }
        
        helper(N,myList,currString+"1",val1+1,val0);
        if(val1>=val0+1) helper(N,myList,currString+"0",val1,val0+1);
    }
    
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> myList=new ArrayList<>();
        String currStr="1";
        helper(N,myList,currStr,1,0);
        return myList;
    }
}
