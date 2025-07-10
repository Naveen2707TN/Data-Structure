package Arrays;

import java.util.Scanner;

public class JavaArray {

    private static final int MaxSize = 20; 
    private static int[] arr = new int[MaxSize];
    private static int size = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        insert();
        display();
        insertBegin();
        display();
        insertAtPosition();
        display();
        delete();
        deleteBegin();
        display();
        update();
        display();
    }
    

    public static void insert(){
        System.out.print("Enter the size to insert in array : ");
        System.out.println();
        int siz = sc.nextInt();
        if (siz < size) {
            System.out.println("Out of space");
        }
        for (int i = 0; i < siz; i++) {
            System.out.print("Enter the element to insert in array : ");
            int elem = sc.nextInt();
            arr[i] = elem;
            size++;
        } 
        System.out.println("Success");
    }

    public static void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void insertBegin(){
        System.out.print("Enter the value to insert at Begin : ");
        int val = sc.nextInt();
        for (int i = size; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = val;
        size++;
        System.out.println("Success");
    }

    public static void insertAtPosition(){
        System.out.println("Enter the position to insert the value : ");
        int pos = sc.nextInt();
        if (pos > size-1) {
            System.out.println("out of space");
        }
        System.out.println("Enter the value : ");
        int ele = sc.nextInt();
        for (int i = size; i >=pos; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos] = ele; size++;
        System.out.println("success");
    }

    public static void delete(){
        System.out.println("Enter the pos to delete");
        int pos = sc.nextInt();
        if (size == 0) {
            System.out.println("error");
            return;
        }
        for (int i = pos; i < size; i++) {
            arr[i] = arr[i+1];
        } 
        size--;
    }
    public static void deleteBegin(){
        for(int i = 0; i<size; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    public static void update(){
        System.out.println("Enter the position to update the value : ");
        int pos = sc.nextInt();
        System.out.println("Enter the value : ");
        int val = sc.nextInt();
        arr[pos] = val;
        System.out.println("success");
    }
}