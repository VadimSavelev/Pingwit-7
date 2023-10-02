package pl.pingvit.homework7;
import java.util.Arrays;
public class TaskWithArrays {
    public static void main(String[] args) {
        int[] startArray = {4, 6, 10, 7, 1, 0, 2, 2};
        System.out.println("Start array :"+Arrays.toString(startArray));
        int[] result = new int[startArray.length];
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % 2 == 0) {
                result[i] = startArray[i] * 5;
            } else result[i] = startArray[i];
        }
        System.out.println("Result array :"+Arrays.toString(result));
    }
}
