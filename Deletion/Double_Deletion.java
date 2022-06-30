public class Double_Deletion {
    public Node head;
    int size;

    Double_Deletion(){
        size=0;
    }

    public class Node{
        int data;
        Node next;
        Node prev;
        

// constructor
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public void insert_First(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
// Delete from the first Node of Linklist
    public void Delete_First(){
        size--;
        if(head==null){
            System.out.println("Linklist is Null Nothing is here to Delete");
            return;
        }
        head=head.next;
    }
// Delete from the last Node of the Linklist
    public void Delete_Last(){
        Node currentNode=head;
        Node SecondNode=head.next;
        // Traversal
        while(SecondNode.next!=null){
            currentNode=currentNode.next;
            SecondNode=SecondNode.next;
        }
        currentNode.next=null;
    }

    public void print(){
        Node currentNode=head;

        if(head==null)
        {
            System.out.println("Linklist is Empty !");
        }
        while(currentNode!=null){
            System.out.print(currentNode.data+"-");
            currentNode=currentNode.next;
        }
        System.out.pr

    public static void main(String args[]){
        Double_Deletion obj=new Double_Deletion();
        obj.insert_First(2);
        obj.insert_First(3);
        obj.insert_First(4);
        // obj.Delete_First();
        obj.Delete_Last();
        obj.print();
    }
}
