import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by boris on 6/16/2016.
 */
public class Largest_sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String words = s.nextLine();
        String[] wordsArr = words.split(" ");
        String currentWord=wordsArr[0];
        LinkedHashMap<String,Integer> word_size = new LinkedHashMap<>();
        int occasion=1;
        for (int i = 1; i <=wordsArr.length ; i++) {
            //fix for i =wordsArr.length; Adds the last element to the HashMap
            if (i == wordsArr.length && !word_size.containsKey(currentWord)) {
                word_size.put(currentWord, occasion);
                break;
            } else if (i == wordsArr.length && word_size.get(currentWord) <= occasion) {
                word_size.replace(currentWord, occasion);
            }
            //end of fix
            if (wordsArr[i].equals(currentWord)) {
                occasion++;
            } else {
                if (!word_size.containsKey(currentWord)) {
                    word_size.put(currentWord, occasion);
                    currentWord = wordsArr[i];
                    occasion = 1;
                } else if (word_size.get(currentWord) <= occasion) {
                    word_size.replace(currentWord, occasion);
                }
            }
        }
        int maxElementFrequency=0;
        System.out.println(word_size);
        HashMap.Entry<String,Integer> mostFrequent = null;
        for (Map.Entry<String,Integer> word : word_size.entrySet()) {
            if (mostFrequent == null || word.getValue().compareTo(mostFrequent.getValue()) > 0)
            {
                mostFrequent = word;
            }
        }
        for (int i = 0; i<mostFrequent.getValue();i++){
            System.out.print(mostFrequent.getKey()+" ");
        }
    }
}
