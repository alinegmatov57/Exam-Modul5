package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Base64;

public class FirstTask{
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream("D:\\java backend pdp\\Modul5_Exam_1\\src\\main\\java\\tasks\\motivation.mp4");

        FileOutputStream outputStream = new FileOutputStream("D:\\java backend pdp\\Modul5_Exam_1\\src\\main\\java\\tasks\\file.txt");
        byte[] bytes = in.readAllBytes();
        outputStream.write(encoding(bytes));
        outputStream.flush();


    }
    private static byte[] encoding(byte[] bytes) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedString = encoder.encode(bytes);
        return encodedString;
    }
}
