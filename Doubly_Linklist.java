
import java.util.Scanner;
import java.util.*;

public class Doubly_Linklist{

    static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.next=null;
            this.data=data;
            this.prev=null;
        }
    }
    // head Node initialization
    public Node head;
    public void insertfirst(int data)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        Node newNode=new Node(data);
        System.out.println("press:1 -> To Enter the Data");
        System.out.println("press:2 -> To Print the Data");
        n=sc.nextInt();
        do{
            if(head==null)
            {
                head=newNode;
                return;
            }
        // Main Condition
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }while(n==1);

    }

    public void print()
    {
        
    }
    public static void main(String args[])
    {

    }
}