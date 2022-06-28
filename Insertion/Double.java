package Insertion;

public class Double{
    static class Node{
        Node next;
        int data;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    // head Node inititalization
    public Node head;
    public void insert(int data){
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;
            head.prev=newNode;
            return;
        }
        // Main Condition
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    // print Function
    public void print()
    {
        Node currentNode=head;
        if(head==null){
            System.out.print("Linklist is Empty");
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+"-");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[])
    {
        Double obj=new Double();
        obj.insert(6);
        obj.insert(5);
        obj.insert(4);
        obj.insert(3);
        obj.insert(2);
        obj.insert(1);
        obj.print();
    }
}
