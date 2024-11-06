public class detectLoop {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static Node head;
    public static Node tail;
public static boolean iscycle(){
    Node slow=head;
    Node fast=head;

    while(fast!=null&& fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
}
    public static void main(String args[]){
        detectLoop ll= new detectLoop();
        head=new Node(45);
        head.next= new Node(85);
        head.next.next=new Node(74);
        head.next.next.next= new Node(0);
        
       System.out.println(iscycle()); 


    }
    
}
