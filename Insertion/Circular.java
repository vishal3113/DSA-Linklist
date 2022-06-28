import java.util.*;

public class Circular {
    public class Node{
        int data;
        
        Node next;
        Node(int data){
            this.data=data;
          
            this.next=head;
        }
    }
    public Node tail=null;
    public Node head=null;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        // Main Condition
        tail.next=newNode;
        tail=newNode;
        tail.next=head;

    }

    public void print()
    {
        Node currentNode=head;
        while(currentNode.next!=head){
            System.out.print(currentNode.data+"-");
            currentNode=currentNode.next;
        }
        

    }

    public static void main(String args[])
    {
        Circular obj=new Circular();
        obj.insert(8);
        obj.insert(3);
        obj.insert(6);
        obj.insert(3);
        obj.print();
    }
}
