import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String desktopPath = System.getProperty("user.home") + "/Desktop/";
        String fileName = "file.txt";
        String filePath = desktopPath + fileName;

        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }



}
