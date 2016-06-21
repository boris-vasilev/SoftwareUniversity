import java.util.Scanner;

/**
 * Created by boris on 6/21/2016.
 */
public class Find_all_words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] sentenceSplit = sentence.split("\\W+");
        System.out.println(sentenceSplit.length);
    }
}
