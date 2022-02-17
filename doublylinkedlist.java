package lab21;
import java.util.Scanner;
class DoublyLinkedList {    

    //A node class for doubly linked list

    class Node{  

        int item;  
        Node previous;  
        Node next;  
         public Node(int item) {  

            this.item = item;  

        }  

    }  

    //Initially, head and tail is set to null

    Node head, tail = null;  

   

    //add a node to the list  

    public void addNode(int item) {  

        //Create a new node  

        Node newNode = new Node(item);  

        //if list is empty, head and tail points to newNode  

        if(head == null) {  

            head = tail = newNode;  

            //head's previous will be null  

            head.previous = null;  

            //tail's next will be null  

            tail.next = null;  

        }  

        else {  

            //add newNode to the end of list. tail->next set to newNode  

            tail.next = newNode;  

            //newNode->previous set to tail  

            newNode.previous = tail;  

            //newNode becomes new tail  

            tail = newNode;  

            //tail's next point to null  

            tail.next = null;  

        }  

    }  

    public void deleteNodes() {

    int x = head.item;

        head = head.next;

        System.out.println("Element "+x +" got deleted");

   }

//print all the nodes of doubly linked list  

    public void printNodes() {  

        //Node current will point to head  

        Node current = head;  

        if(head == null) {  

            System.out.println("Doubly linked list is empty");  

            return;  

        }  

        System.out.println("Nodes of doubly linked list: ");  

        while(current != null) {  

            //Print each node and then go to next.  

            System.out.print(current.item + " ");  

            current = current.next;  

        }  

    }  
}
    public class Dlinkedlist
    {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
DoublyLinkedList c=new DoublyLinkedList();
int c1=0;
while(c1!=4)
{
System.out.println("\nenter the option");
System.out.println("1.addnode\n2.deletenode\n3.display \n4.exit");
int op =s.nextInt();


switch(op)
{
case 1: System.out.println("enter the elements do u want to insert");
int element=s.nextInt();
c.addNode(element);
break;
case 2:c.deleteNodes();
break;
case 3:c.printNodes();
break;
case 4:c1=4;
break;
default:System.out.println("invalid input");

}

}
}
}
