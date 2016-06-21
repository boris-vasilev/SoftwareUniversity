import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by boris on 6/21/2016.
 */
public class Count_specified_word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        String[] sentenceSplit = sentence.split("\\W+");
        String word= s.nextLine();
        int occurance=0;
        for (String str : sentenceSplit) {
         if(str.equals(word)){
             occurance++;
         }
        }
        System.out.println(occurance);
    }
}

