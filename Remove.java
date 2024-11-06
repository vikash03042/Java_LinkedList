public class Remove{
public static  class Node{
int data;
Node next;

public Node(int data){
    this.data=data;
    this.next=null;
}
}
public static Node head;
public static Node tail;
public static int size;
public void addfirst(int data){
    Node newNode= new Node(data);
    size++;
    if(head== null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;

}
public void addlast(int data){
    Node newNode= new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
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

public int  remfirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head =tail=null;
        size=0;
        return val;
    }
    int val= head.data;
    head= head.next;
    size--;
    return val;
}
public int remLast()
{
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val =head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
}

public static void main(String[] args) {
    Remove ll= new Remove();
    ll.addfirst(58);
    ll.addlast(65);
    ll.addfirst(96);
    ll.addlast(74);
    ll.print();
    System.out.println(ll.size);
    ll.remfirst();
    ll.print();
    System.out.println(ll.size);
    ll.remLast();
    ll.print();
    System.out.println(ll.size);

}
}