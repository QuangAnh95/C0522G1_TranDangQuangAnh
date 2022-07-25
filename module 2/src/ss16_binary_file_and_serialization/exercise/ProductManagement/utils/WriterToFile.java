package ss16_binary_file_and_serialization.exercise.ProductManagement.utils;

import ss16_binary_file_and_serialization.exercise.ProductManagement.model.Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriterToFile {
    public static void writerToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
