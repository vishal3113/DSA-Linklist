package Insertion;

public class single {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// head node initiallization
public Node head;

    public void insertion(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        // Main Condition
        newNode.next=head;
        head=newNode;

    }
    // print function
    public void print(){
        Node currentNode=head;

        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]){
            single obj=new single();
            obj.insertion(3);
            obj.insertion(4);
            obj.insertion(5);
            obj.insertion(123);
            obj.print();
    }
}
