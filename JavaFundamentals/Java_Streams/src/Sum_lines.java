import java.io.*;

/**
 * Created by nata on 16.6.2016 г..
 */
public class Sum_lines {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(
                        "lines.txt"
                )
        )) {
            String line;
            while ((line = br.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
            }
        } catch (IOException ioex) {

        }
    }
}
//import java.io.*;
//
///**
// * Created by nata on 16.6.2016 г..
// */
//public class Sum_lines {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(
//                new FileReader(
//                        "lines.txt"
//                )
//        )) {
//            String line;
//            while((line = br.readLine())!= null){
//                int sum=0;
//                for (int i = 0; i < line.length(); i++) {
//                    sum+=line.charAt(i);
//                }
//                System.out.println(sum);
//            }
//        } catch (IOException ioex) {
//
//        }
//    }
//}

