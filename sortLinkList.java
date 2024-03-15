//   Linked List that is Sorted Alternatingly   (GeeksforGeeks)


/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);
        temp=head;
        for(int i = 0 ;  i < arr.size() ; i ++){
            temp.data = arr.get(i);
            temp=  temp.next;
        }
        return head;
   }
}
