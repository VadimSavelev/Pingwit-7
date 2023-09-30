package pl.pingvit.homework5;
public class Average {
    //    Есть массив чисел. Найти среднее арифметическое число элементов массива
    public static void main(String[] args) {
        int[] mas = {2, 3, 4, 8, 4, 5};
        double sum = 0;
        for (int number : mas) {
            sum += number;
        }
        System.out.println("Average =" + (sum / mas.length));
    }
}