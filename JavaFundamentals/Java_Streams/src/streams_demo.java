import java.io.*;

/**
 * Created by nata on 16.6.2016 г..
 */
public class streams_demo {
    public static void main(String[] args) throws IOException {
//        DataOutputStream dos = new DataOutputStream(
//                new BufferedOutputStream(
//                        new FileOutputStream(
//                                new File("mydata.txt")
//                        )
//                )
//        );
//        String gosho="gosho";
//        dos.writeUTF(gosho);
//        dos.writeInt(6);
//
//        dos.close();
        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                "mydata.txt"
                        )
                )
        ) ;
        String name= dis.readUTF();
        System.out.println(name);
        int grade = dis.readInt();
        System.out.println(grade);
        dis.close();
    }
}
