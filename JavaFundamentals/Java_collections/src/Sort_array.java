import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by boris on 6/16/2016.
 */
public class Sort_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=s.nextInt();

        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
