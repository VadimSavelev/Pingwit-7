package pl.pingvit.homework5;
import java.util.Arrays;
//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
public class ArrayOfEvenOnesFromTheFirst {
    public static void main(String[] args) {
        int[] initial = {2, 3, 5, 7, 8, 4, 2};
        int evenNumsCounter = 0;
        for (int i = 0; i < initial.length; i++) {
            if (initial[i] % 2 == 0) {
                evenNumsCounter++;
            }
        }
        int[] result = new int[evenNumsCounter];
        int index = 0;
        for (int i = 0; i < initial.length; i++) {
            if (initial[i] % 2 == 0) {
                result[index] = initial[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
