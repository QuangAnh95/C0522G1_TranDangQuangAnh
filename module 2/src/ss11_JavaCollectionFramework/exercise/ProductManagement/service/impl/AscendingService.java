package ss11_JavaCollectionFramework.exercise.ProductManagement.service.impl;

import ss11_JavaCollectionFramework.exercise.ProductManagement.model.Product;

import java.util.Comparator;

public class AscendingService implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (o2.getPrice() - o1.getPrice());
    }
}
