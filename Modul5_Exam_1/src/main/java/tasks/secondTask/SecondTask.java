package tasks.secondTask;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SecondTask {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson=new Gson();
        TypeToken typeToken= TypeToken.getParameterized(List.class,Student.class);
        try {
            List<Student> students = gson.fromJson(Files.readString(Path.of("Modul5_src/main/java/tasks/secondTask/Student.json")), typeToken.getType());
            double ortacha=students.stream()
                    .mapToInt(student->student.getAge())
                    .average()
                    .orElse(0.0);
            System.out.println("O'rtacha yosh: "+ortacha);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
