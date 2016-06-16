import java.io.*;

/**
 * Created by nata on 16.6.2016 г..
 */
public class All_capitals {
    public static void main(String[] args) {
        String uppercasedLine;
        try (BufferedReader br = new BufferedReader(new FileReader("all_capitals.txt"))) {
            String line = br.readLine();
            uppercasedLine = line.toUpperCase();
        } catch (IOException ioex) {

        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("all_capitals.txt"))) {
        } catch (IOException ioex) {

        }
    }
}
