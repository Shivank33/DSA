//     Level order traversal     (GeeksforGeeks)


/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null)
            return list;
            
        q.add(root);
        while(!(q.isEmpty())){
            Node Temp= q.poll();
            list.add(Temp.data);
            
            if(Temp.left!= null){
                q.add(Temp.left);
                    }
            if(Temp.right!= null){
                q.add(Temp.right);
            }
        }
        return list ;
    }
}
