package pl.pingvit.homework20;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class BenchmarkForRemovingFromTheMiddleList {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        creatAList(arrayList, size);
        long startTime = System.currentTimeMillis();
        deleteInMiddle(arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Remove in Middle: " + (endTime - startTime) + " milliseconds");

        List<Integer> linkedList = new LinkedList<>();
        creatAList(linkedList, size);
        startTime = System.currentTimeMillis();
        deleteInMiddle(linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Remove in Middle: " + (endTime - startTime) + " milliseconds");
    }
    private static void creatAList(List<Integer> list, int size) {
        for (int i = 0; i <= size; i++) {
            list.add(i);
        }
    }
    private static void deleteInMiddle(List<Integer> list) {
        for (int i = list.size() / 2; i <= list.size(); i++)
            list.remove(i);
    }
}
