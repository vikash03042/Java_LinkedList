public class Reverse {
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
    // public static int size;
public void addfirst(int data){
    Node newNode=new Node(data);
    // size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addlast(int data){
    Node newNode=new Node(data);
if(head==null){
    head=tail=newNode;
}
tail.next=newNode;
tail=newNode;
}
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}
public void REV(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}

public void delete(int n){
    int size=0;
    Node temp=head;
    while(temp != null){
        temp=temp.next;
        size++;
    }
    if(n== size){
        head=head.next;
        return;
    }
    int i=1;
    int iTofind=size-n;
    Node prev=head;
    while(i<iTofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
}
    public static void main(String[] args) {
        Reverse ll= new Reverse();
        ll.addfirst(55);
        ll.addfirst(85);
        ll.addfirst(95);
        ll.addlast(74);
        ll.addlast(35);
        // System.out.println(ll.size);
        ll.print();
        ll.REV();
        ll.print();
        ll.delete(3);
        ll.print();

    }
}
