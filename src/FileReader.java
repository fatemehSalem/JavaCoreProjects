import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public String readFile(String fileName) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return content.toString();
    }

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        try {

            String content = reader.readFile("non-existent-file.txt");
            System.out.println(content);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }

}
