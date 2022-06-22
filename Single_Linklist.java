import java.util.*;


public class Single_Linklist{
    // Class of Node
    static class Node{
        Node next;
        int data;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    // Head Node assigned to Null
    Node head=null;

    public void insertFirst(int data){
        // node variable
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        //Main conditoin if The Linklist is not null
        newNode.next=head;
        head=newNode;
    }

    // For Traversal

    public void Traversal(){
        Node currentNode=head;

        if(head==null)
        {
            System.out.println("Linklist is Empty !");
        }
        else
        {
            while(currentNode!=null){
                System.out.print(currentNode.data+"-");
                currentNode=currentNode.next;
            }
            System.out.print("null");
        }
    }



public static void main(String args[])
    {
        Single_Linklist obj=new Single_Linklist();
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.Traversal();
    }


}