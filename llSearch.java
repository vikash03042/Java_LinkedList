public class llSearch {
public class Node{
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
    Node newNode= new Node(data);
    if(head==null){
        head =tail =newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addlast(int data){
    Node newNode= new Node(data);
    if(head==null){
        head= tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

public void add(int idx,int data){
    Node newNode= new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp= temp.next;
        i++;
    }
 newNode.next=temp.next;
 temp.next=newNode;
}

public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}
    public int itrsearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        llSearch ll=new llSearch();
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.addlast(25);
        ll.print();
        ll.add(4, 0);
ll.addlast(32);
        ll.print();
        System.out.println(ll.itrsearch(0));
        System.out.println(ll.itrsearch(4));
    }
}
