package pl.pingvit.homework5;
import java.util.Arrays;
//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
public class ArrayOfEvenOnesFromTheFirst {
    // нужно сделать форматирование кода
    public static void main(String[] args) {
        int[] mas = {2, 3, 5, 7, 8, 4, 2}; // mas - имя переменной несет недостаточно информации. варианты: initial (изначальный), start, initialData
        int evenNums = 0;  // в переменной хранится счетчик - предлагаю ей более точное имя, например evenNumsCounter
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                evenNums++;
            }
        }
        int[] mas2 = new int[evenNums];  // mas2 - имя переменной несет недостаточно информации. варианты: result, evenNumbers
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas2[index] = mas[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
