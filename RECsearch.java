public class RECsearch {

    public class Node{
        int data;
        Node next;
        public  Node(int data){
        this.data= data;
        this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null)
{
    head=tail=newNode;
    return;
}        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
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
public int helper(Node head,int key){
if(head==null){
    return -1;
}
if(head.data==key){
    return 0;
}
int idx= helper(head.next,key);
if(idx==-1){
    return -1;
}
return idx+1;
}
    public  int recSearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        RECsearch ll= new RECsearch();
        ll.addfirst(55);
        ll.addfirst(85);
        ll.addfirst(95);
        ll.addlast(74);
        ll.addlast(35);
        System.out.println(ll.size);
        ll.print();
System.out.println(ll.recSearch(55));

        
    }
}
