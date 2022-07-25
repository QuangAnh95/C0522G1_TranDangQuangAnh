package ss16_binary_file_and_serialization.exercise.binaryFilesCopy.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFileUsingJava7 {
   public static void copyFileUsingJava7(File source, File target) throws IOException {
        Files.copy(source.toPath(),target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
