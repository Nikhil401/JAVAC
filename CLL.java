/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static Node head;
    public static void main(String[] args) {
		
		initializeCLL();
		printCCL();
		System.out.println("\n******NEW*******");
		insertCLL(10);
		insertCLL(11);
		insertCLL(12);
		insertCLL(13);
		printCCL();
		System.out.println("\n******NEW*******");
		deleteCLL();
		printCCL();
	}
	private static void deleteCLL()
    {
        Node last=head;
        while(last.next!=head)
        {
            last=last.next;
        }
        last.next=head.next;
        head=head.next;
    }
    private static void initializeCLL() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node1;
		head = node1;

	}
    private static void printCCL()
    {
        Node last=head;
        while(last.next!=head)
        {
            System.out.print(last.data+" ");
            last=last.next;
        }
        System.out.print(last.data);
    }
     private static void insertCLL(int data)
    {
        Node new_node=new Node(data);
        Node last=head;
        while(last.next!=head)
        {
            last=last.next;
        }
        last.next=new_node;
        new_node.next=head;
        head=new_node;
    }
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
}
