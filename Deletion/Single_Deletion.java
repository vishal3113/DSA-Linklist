

public class Single_Deletion {
    
    int size;
    // class Constructor
    Single_Deletion(){
        size=0;
    }

        public class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
                size++;
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

        // Deletion Function
        public void DeletionFirst(){
            
            if(head==null)
            {
                System.out.println("NOthing is here to Delete in the Given Linklist");
                return;
            }
            // Main Function
            head=this.head.next;
            size--;
        }
        
        // Delete last Program
        public void DeletionLast(){
            // 1st Method 
            if(head==null){
                System.out.println("Nothing is here to Delete in the Given Linklist");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }

            // 2nd Method
            // Node CurrentNode=head;
            // Node SecondNode=head.next;

            // while(CurrentNode.next!=null){
            //     CurrentNode=CurrentNode.next;
            //     SecondNode=SecondNode.next;
            // }
            // SecondNode=null;
            // CurrentNode.next=null;
        }

        // print function
        public void print(){
            Node currentNode=head;
    
            while(currentNode!=null)
            {
                System.out.print(currentNode.data+"->");
                currentNode=currentNode.next;
            }
            
        }
    public static void main(String args[]){
        Single_Deletion obj=new Single_Deletion();

        obj.insertion(2);
        obj.insertion(3);
        obj.insertion(4);
        obj.insertion(5);
        obj.DeletionLast();
        // obj.DeletionFirst();
        obj.print();
        
    }
}
