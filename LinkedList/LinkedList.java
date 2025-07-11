package LinkedList;

import java.util.Stack;

public class LinkedList {
    
    Node head;
    Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public void insertAtBegin(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
             
        }else{
            node.next = head;
            head = node;
             
        }
    }

    public void Display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" null ");
    }

    public void insertAtPosition(int pos , int val){
        pos = pos -1;
        if(pos == -1){
            System.out.println("out of space");
        }
        if (pos == 0) {
            insertAtBegin(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            if(temp == null){
                System.out.println("out of space");
                return;
            }
            temp = temp.next;
        }
        Node npNode = new Node(val);
        npNode.next = temp.next;
        temp.next = npNode;

    }

    public void delete(){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFirst(){
        Node temp = head;
        if (head == null) {
            return;
        }
        temp = temp.next;
        head = temp;
    }

    public void DeleteAtPosition(int pos){
        Node temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void ReverseLinkedlist(){
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        head = stack.pop();
        temp = head;
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.Display();
        linkedList.insertAtBegin(1);   
        linkedList.Display();
        linkedList.insertAtPosition(2, 200);
        linkedList.Display();
        linkedList.delete();
        linkedList.Display();
        linkedList.deleteFirst();
        linkedList.Display();
        linkedList.DeleteAtPosition(2);
        linkedList.Display();
        linkedList.ReverseLinkedlist();
        linkedList.Display();
    }

}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
