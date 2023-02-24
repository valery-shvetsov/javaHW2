import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.

public class hw22 {
    public static void main(String[] args) {
        try {
        File f = new File("C:\\Users\\S9057\\Desktop\\Java_pro\\HW2\\file.txt");
        //Создаем новый файл
            // Проверяем, что он не существует 
            if (f.createNewFile())
                System.out.println("Файл успешно создан");
            else
                System.out.println("Файл уже существует");
        }
        catch (Exception e) {
            System.err.println(e);
        }

    Path path = Paths.get( "C:\\Users\\S9057\\Desktop\\Java_pro\\HW2\\file.txt");
    String text = "TEST ";
    String textresult=text;
    for (int i = 0; i <= 100; i++) {
        textresult+=text;
    }
    try {
        Files.writeString(path, textresult);
    } catch (IOException ex) { 
    }

    try {
        File file2 = new File("C:\\Users\\S9057\\Desktop\\Java_pro\\HW2\\file2.txt");
            if (file2.createNewFile())
                System.out.println("Файл успешно создан");
            else
                System.out.println("Файл уже существует");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    Path path2 = Paths.get( "C:\\Users\\S9057\\Desktop\\Java_pro\\HW2\\file2.txt");
    String text2 = "TEST2 ";

    // System.out.println(text);
    
    for (int i = 0; i <= 100; i++) {
        try {
            Files.writeString(path2, text2, StandardOpenOption.APPEND);         
            } catch (IOException ex) { 
            }
    }
       
    }
} 


