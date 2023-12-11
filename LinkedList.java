import java.util.Arrays;

public class RotateArray {
 
    
    
    public static void shiftAndPush(int[] array){
        /*
            This method  acts as a queue  it takes an array as a parameter dequeues 
            the array's element and enqueus it at the end only once 
        *
        */ 
        int dequeuedValue = array[0];

        for(int i= 0;i < array.length-1; i++ ){
            array[i] = array[i + 1]; 

        }

        array[array.length-1] = dequeuedValue;


}


public static void rotate(int[] array, int shiftNumber){
    /*  This method  is the rotator it takes an array and rotate it according to the 
        number of shifts provided
    
    */

    // For loop to perform the rotations
    for( int round  = 0; round < shiftNumber; round++){

        shiftAndPush(array);

    }


}

public static void main(String[] args) {  
    
    int[] array = {1,2,3,4,5,};
    
    //Prints Array before rotation
    System.out.println(Arrays.toString(array)); 

    
    rotate(array, 4); // Prints [5, 1, 2, 3, 4] after rotation


    // Prints Array after rotation
    System.out.println(Arrays.toString(array)); 
}



}

class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;


    // This is a constructor for SinglyLinkedListNode
    public SinglyLinkedListNode(int data){
        this.data = data;
    }

}

public class SinglyLinkedListInsertion {




    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position){

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if(position == 0){
            newNode.next = head;
            
            return newNode;
        }


        SinglyLinkedListNode current = head;
        
        for (int i = 0; i < position - 1; i++) {
            
            current = current.next;

        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }


    static void printLikedLIst(SinglyLinkedListNode head){

        while(head != null){

            System.out.println(head.data);
            head = head.next;

        }

    }

    // Main Method To to Test the InsertAtPosition Function.c
    public static void main(String[] args) {
        
        SinglyLinkedListNode head = new SinglyLinkedListNode(3);
        head.next  = new SinglyLinkedListNode(4);

        head.next.next = new SinglyLinkedListNode(7);

        printLikedLIst(head); // Prints 3,4,7

        SinglyLinkedListNode newHead = insertNodeAtPosition(head, 5, 1);

        printLikedLIst(newHead); // Prints 3,5,4,7

    }


}


