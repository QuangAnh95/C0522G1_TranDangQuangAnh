package ss15_text_file.exercise.fileTextRead.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> list() throws IOException {
        List<String> nationalList = new ArrayList<>();
        File file = new File("ss15_text_file/exercise/fileTextRead/data/ nation.csv");
        {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);

                }
            } catch (FileNotFoundException e) {
                System.err.println("File is NOT found!");
            }
        }
        return nationalList;
    }

    public static void main(String[] args) throws IOException {
        list();
    }
}
