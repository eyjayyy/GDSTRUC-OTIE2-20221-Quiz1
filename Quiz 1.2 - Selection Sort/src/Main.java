public class Main {
    public static void main(String[] args) {
        // Initialize array - 25,3,5,10,38,62,20,8,173,65
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 9;
        numbers[6] = 20;
        numbers[7] = 9;
        numbers[8] = 173;
        numbers[9] = 65;

        // Unsorted array
        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers);
        System.out.print("\n\n");

        // Sorted array
        System.out.print("Array After Sorting: ");
        selectionSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n");
    }

    // Prints array
    private static void printArrayElements(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    // Sorts array using selection sort (descending)
    private static void selectionSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (numbers[i] < numbers[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            // Swap element in smallestIndex with element in lastSortedIndex
            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[lastSortedIndex];
            numbers[lastSortedIndex] = temp;
        }
    }
}