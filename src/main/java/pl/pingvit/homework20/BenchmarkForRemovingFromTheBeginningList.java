package pl.pingvit.homework20;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class BenchmarkForRemovingFromTheBeginningList {
    public static void main(String[] args) {

        int size = 100000;

        List<Integer> arrayList = new ArrayList<>();
        creatList(arrayList, size);
       long startTime = System.currentTimeMillis();
        deleteFromBeginner(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList = new LinkedList<>();
        creatList(linkedList, size);
        startTime = System.currentTimeMillis();
        deleteFromBeginner(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Beginner: " + (endTime - startTime) + " milliseconds");
    }

    private static void creatList(List<Integer> list, int size) {
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
    }

    private static void deleteFromBeginner(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}

