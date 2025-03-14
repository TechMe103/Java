import java.util.Arrays;

public class ArrayListOOPs2 {
    private int[] arr;
    private int idx;
    private int size;

    // Constructor to initialize the array
    public ArrayListOOPs2() {
        arr = new int[5]; // Initial size of the array
        idx = 0;
        size = 0;
    }

    // Method to add an element to the array
    public void add(int ele) {
        if (size == arr.length) {
            // Resize the array when it is full
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[idx] = ele; // Add the new element
        idx++;
        size++;
    }

    // Method to print the elements of the array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListOOPs2 list = new ArrayListOOPs2();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60); // This will trigger resizing

        // Print the elements of the array
        list.printArray();
    }
}
