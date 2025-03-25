package Ex09;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tao danh sach san pham
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000));
        products.add(new Product("Smartphone", 500));
        products.add(new Product("Tablet", 300));
        products.add(new Product("Smartwatch", 200));
        products.add(new Product("Headphone", 150));
        // Tao doi tuong ProductProcessor xu ly cac thao tac tren danh sach san pham
        ProductProcessor productProcessor = new ProductProcessorImpl();
        System.out.println("Danh sach san pham:");
        ProductProcessor.printProductList(products);
        System.out.println("Tong gia tri cua cac san pham: " + productProcessor.caculateTotalValue(products));

        if(productProcessor.hasExpensiveProduct(products)){
            System.out.println("Cac san pham co gia tren 100 la: ");
            for(Product product : products){
                if(product.getPrice() > 100){
                    System.out.println(product);
                }
            }

        } else {
            System.out.println("Khong co san pham co gia tren 100");
        }

    }
}
