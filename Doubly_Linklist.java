public class Doubly_Linklist {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    // Head Node Implimentation
    public Node head;

    public void insertFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        // Main Condition
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }

    public void print(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }
    public static void main(String args[])
    {
        Doubly_Linklist obj=new Doubly_Linklist();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.print();
    }
}

