package pl.pingvit.homework21;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemovingEvenElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(0, i);
        }
        System.out.println("Исходный список:" + numbers);

        removeEvenNumbers(numbers);
        System.out.println("список после удаления :"+numbers);
    }

        private static void removeEvenNumbers (List < Integer > list) {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() % 2 == 0) {
                    iterator.remove();
                }
            }
        }
    }
