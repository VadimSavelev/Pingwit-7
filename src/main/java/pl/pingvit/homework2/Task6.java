package pl.pingvit.homework2;

public class Task6 {
    public static void main(String[] args) {
        String myStringValue1 = "123";
        String myStringValue2 = "877";
        // в этом задании все задумывалось проще:
        //System.out.println("Сумма двух строк = " + myStringValue1 + myStringValue2);
        Integer myParsendSumString = Integer.parseInt(myStringValue1) + Integer.parseInt(myStringValue2);
        System.out.println("Сумма двух строк = " + myParsendSumString);
    }
}
