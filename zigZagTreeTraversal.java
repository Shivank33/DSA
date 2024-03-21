//   ZigZag Tree Traversal    (GeeksforGeeks)


/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> list=new ArrayList<>();
	    Queue<Node>q=new LinkedList<>();
	    int a=0;
	    q.offer(root);
	   
	    while(!q.isEmpty()){
	        int size=q.size();
	    Stack<Integer> st=new Stack<>();
	        for(int i=0;i<size;i++){
	            Node temp=q.poll();
	            if(a%2==0)    list.add(temp.data);
	            else{
	                    st.push(temp.data);
	                }
	                    if(temp.left!=null) q.offer(temp.left);
	                    if(temp.right!=null) q.offer(temp.right);
	                }
	                while(!st.isEmpty()){
	                    list.add(st.pop());       
	            }
	                a++;
	        }
	    return list;
	}
}
