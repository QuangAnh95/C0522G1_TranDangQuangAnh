package ss16_binary_file_and_serialization.exercise.binaryFilesCopy.view;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static ss16_binary_file_and_serialization.exercise.binaryFilesCopy.utils.CopyFileUsingJava7.copyFileUsingJava7;

public class BinaryFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter target file");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        try {
            copyFileUsingJava7(sourceFile,targetFile);
            System.out.println("Copy completed");

        }catch (IOException e){
            System.out.printf("Can't copy that file");

        }

    }

}
