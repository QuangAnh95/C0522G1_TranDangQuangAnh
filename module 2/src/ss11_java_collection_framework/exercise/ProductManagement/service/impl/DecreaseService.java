package ss11_java_collection_framework.exercise.ProductManagement.service.impl;

import ss11_java_collection_framework.exercise.ProductManagement.model.Product;

import java.util.Comparator;

public class DecreaseService implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (o1.getPrice()-o2.getPrice());
    }
}
