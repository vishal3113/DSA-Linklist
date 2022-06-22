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

    public void creation(){
        int data,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data in the linklist :");
        data=sc.nextInt();
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    // For Traversal

    public void Traversal(){

    }



public static void main(String args[])
    {
        
    }


}