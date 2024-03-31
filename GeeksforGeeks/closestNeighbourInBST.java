//     Closest Neighbour in BST    (GeeksforGeeks)


// User function Template for Java

/*class Node
{
    int key;
    Node left, right;

    Node(int x)
    {
        key = x;
        left = right = null;
    }

}*/
class Solution {
    public static int findMaxForN(Node root, int n) {
        int closest = -1; 
        
        while (root != null) {
            if (root.key <= n) {
                closest = root.key;
                root = root.right;
            } 
            else {
                root = root.left;
            }
        }
        
        return closest;
    }
}
