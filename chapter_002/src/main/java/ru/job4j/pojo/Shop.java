package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Salt", 27);
        products[4] = new Product("Apple", 8);

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2" +
                " и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        Shop shop = new Shop();
        shop.delete(products, 2);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        if (products.length - 1 - index >= 0)
            System.arraycopy(products, index + 1, products, index, products.length - 1 - index);
        products[products.length - 1] = null;
        System.out.println();
        return products;
    }
}
