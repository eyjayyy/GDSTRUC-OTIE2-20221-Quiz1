public class Main {
    public static void main(String[] args) {
        // Initialize array
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = 8;
        numbers[8] = 173;
        numbers[9] = 65;

        // Unsorted array
        System.out.print("Array Before Sorting: ");
        printArrayElements(numbers);
        System.out.print("\n\n");

        // Sorted array
        System.out.print("Array After Sorting: ");
        bubbleSort(numbers);
        printArrayElements(numbers);
        System.out.print("\n");
    }

    // Prints array
    private static void printArrayElements(int[] numbers) {
        for (int value : numbers ) {
            System.out.print(value + " ");
        }
    }

    // Sorts array using bubble sort (descending)
    private static void bubbleSort(int[] numbers) {
        for (int lastSortedIndex = numbers.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (numbers[i] < numbers[i + 1]) {
                    // Swap the adjacent elements
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
}