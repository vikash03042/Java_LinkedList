
public class linkedlist{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node head;
    public static Node tail;
    public  void prnt(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println();
    }



       public static void main(String args[]){
 linkedlist ll= new linkedlist();
 ll.head=new Node(1);
 ll.head.next = new Node(2);
ll.prnt();
    }
}