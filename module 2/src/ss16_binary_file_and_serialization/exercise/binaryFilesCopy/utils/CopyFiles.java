package ss16_binary_file_and_serialization.exercise.binaryFilesCopy.utils;

import java.io.*;

public class CopyFiles {
    public static void CopyFiles(File source,File target) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer))>0){
                output.write(buffer,0,length);
            }
        }finally {
            input.close();
            output.close();
        }
    }
}
