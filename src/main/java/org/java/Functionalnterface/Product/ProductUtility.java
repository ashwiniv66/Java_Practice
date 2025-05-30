package org.java.Functionalnterface.Product;

import java.util.Arrays;
import java.util.List;

public class ProductUtility {
    public static void main(String[] args) {
        ProductList hotel = new ProductList(1000,"hotel",5.0,100);
        ProductList watch = new ProductList(2000,"watch",4.9,600);
        ProductList shirt = new ProductList(3000,"shirt",3.0,500);
        ProductList violin = new ProductList(4000,"violin",4.0,800);

        List<ProductList> lst = Arrays.asList(hotel,watch,shirt,violin);
        System.out.println("Product based on rating > 4");
        printProductRating(lst);
        System.out.println("Product based on price > 500");
        printProductPrice(lst);
    }
    private static void printProductRating(List<ProductList> lst){
        for(ProductList product : lst){
            if(product.getRating()>4){
                System.out.println("The product name : " + product.getName());
            }
        }
    }
    private static void printProductPrice(List<ProductList> lst){
        for(ProductList product : lst){
            if(product.getPrice() > 500){
                System.out.println("The product name : " + product.getName());
            }
        }
    }
}
