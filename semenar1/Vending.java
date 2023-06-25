package semenar1;

import java.util.ArrayList;
import java.util.List;


// Задача 1 - Абстракция
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

public abstract class Vending {

//                содержащий в себе методы initProducts (List <Product>)
//                сохраняющий в себе список исходных продуктов и getProduct(String name)

    private final List<Product> list;

    public Vending() {
        list = new ArrayList<>();
    }

    void addProduct(Product product) {
        list.add(product);
    }

    Product getProduct(String kind) {
        for (Product product : list) {
            if (kind.equals(product.getKind())) {
                return product;
            }
        }
        return null;
    }

    Product getProduct(Long id) {
        for (Product product : list) {
            if (id.equals(product.getId())) {
                return product;
            }
        }
        return null;
    }

}