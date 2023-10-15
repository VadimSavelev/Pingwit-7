package pl.pingvit.homework6;

public class BubbleSortFromLesson6 {
    public static void main(String[] args) {
        int[] unsorted = {7, 5, 6, 8, -1, -9, -5, -6, -4, 43, 45, 78, 65, 11, 122};
        int[] sorted = bubbleSort(unsorted);
    }

    private static int[] bubbleSort(int[] array) {
        int operationCounter = 0;
        int size = array.length;
        int lastElementIndex = size - 1;
        for (int i = 0; i < lastElementIndex; i++) { //0(n2)
            for (int j = 0; j < lastElementIndex; j++) {
                if (array[i] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                operationCounter++;
            }
            operationCounter++;
        }
        System.out.println("sort took " + operationCounter);
        return array;
    }
}

