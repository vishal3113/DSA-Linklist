// We Implement Circular linklist by using the node
// Tail

public class Circular_Linklist {

    public class Node{
        
        int data;
        Node next;
        Node (int data)
        {
            this.data=data;
            this.next=head;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void insertFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }

    public void Traversal(){
        Node currentNode=head;

        if(head==null)
        {
            System.out.println("Linklist is Empty !");
        }
        else
        {
            do{
                System.out.print(currentNode.data+"-");
                currentNode=currentNode.next;

            }while(currentNode!=head);
        }
        System.out.print("head");
    }

    public static void main(String args[])
    {
        Circular_Linklist obj=new Circular_Linklist();
        obj.insertFirst(4);
        obj.insertFirst(3);
        obj.insertFirst(2);
        obj.insertFirst(1);
        obj.Traversal();
    }
    
}
