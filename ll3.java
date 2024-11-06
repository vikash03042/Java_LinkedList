public class ll3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
public void addfirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addlast(int data){
    Node newNode =new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void prnt(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        ll3 ll=new ll3();  
        // ll.head= new Node(0);
        // ll.head.next=new Node(2);
        // ll.head.next=new Node(3);
        ll.addfirst(25);
        ll.addfirst(35);
        ll.addlast(45);
        ll.addlast(85);
        ll.add(1,2);
        ll.prnt();
    }
}
