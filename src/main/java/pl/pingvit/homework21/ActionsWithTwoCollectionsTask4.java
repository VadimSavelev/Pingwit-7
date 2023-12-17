package pl.pingvit.homework21;
import java.util.ArrayList;
import java.util.List;
public class ActionsWithTwoCollectionsTask4 {
    public static void main(String[] args) {
        List<String> collection1 = new ArrayList<>();
        List<String> collection2 = new ArrayList<>();

        collection1.add("apple");
        collection1.add("banana");
        collection1.add("orange");
        collection1.add("grape");

        collection2.add("banana");
        collection2.add("grape");

        System.out.println("Start collection 1: " + collection1);
        System.out.println("Start collection 2: " + collection2);

        collection1.removeAll(collection2);

        System.out.println("Finish collection 1: " + collection1);
    }
}

