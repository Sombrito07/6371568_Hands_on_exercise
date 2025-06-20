package ecommerce.searchfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Product class
class Product {
    String id;
    String name;
    String category;

    Product(String id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " - " + category;
    }
}

// Search logic
class ProductSearch {
    private List<Product> products = new ArrayList<>();

    public ProductSearch() {
        // Sample product data
        products.add(new Product("P001", "Samsung Galaxy M14", "Mobile"));
        products.add(new Product("P002", "iPhone 15", "Mobile"));
        products.add(new Product("P003", "Nike Running Shoes", "Footwear"));
        products.add(new Product("P004", "HP Laptop", "Electronics"));
        products.add(new Product("P005", "Sony Headphones", "Electronics"));
        products.add(new Product("P006", "Campus Casual Shoes", "Footwear"));
    }

    public List<Product> search(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.name.toLowerCase().contains(keyword.toLowerCase()) ||
                p.category.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}

// Main driver class
public class SearchFunctionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductSearch productSearch = new ProductSearch();

        System.out.print("Enter keyword to search for products: ");
        String keyword = sc.nextLine();

        List<Product> results = productSearch.search(keyword);

        if (results.isEmpty()) {
            System.out.println("No products found for: " + keyword);
        } else {
            System.out.println("Search results:");
            for (Product p : results) {
                System.out.println(p);
            }
        }
    }
}
