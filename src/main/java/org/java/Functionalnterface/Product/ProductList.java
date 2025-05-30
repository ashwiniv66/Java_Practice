package org.java.Functionalnterface.Product;

public class ProductList {

    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public ProductList(Integer id, String name, Double rating, Integer price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
