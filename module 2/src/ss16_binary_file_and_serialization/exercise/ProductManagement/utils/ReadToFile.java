package ss16_binary_file_and_serialization.exercise.ProductManagement.utils;

import ss16_binary_file_and_serialization.exercise.ProductManagement.model.Product;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static List<Product> readToFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

}
