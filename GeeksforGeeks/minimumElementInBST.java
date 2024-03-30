//    Minimum element in BST    (GeeksforGeeks)



/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    
    int minValue(Node root) {

        if(root == null){
            return -1;
        }
        if(root.left == null){
            return root.data;
        }else{
            return minValue(root.left);
        }
    }
}
