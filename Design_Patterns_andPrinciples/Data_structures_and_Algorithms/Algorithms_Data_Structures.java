import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class Algorithms_Data_Structures {

    static Product linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }

    static Product binarySearch(Product[] products, int id) {
        int start = 0;
        int end = products.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (products[mid].productId == id) {
                return products[mid];
            }

            if (products[mid].productId < id) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();

        Product p = linearSearch(products, id);

        if (p != null) {
            System.out.println("Found using Linear Search");
            System.out.println("ID: " + p.productId);
            System.out.println("Name: " + p.productName);
            System.out.println("Category: " + p.category);
        } else {
            System.out.println("Product not found");
        }

        Product b = binarySearch(products, id);

        if (b != null) {
            System.out.println("Found using Binary Search");
            System.out.println("ID: " + b.productId);
            System.out.println("Name: " + b.productName);
            System.out.println("Category: " + b.category);
        } else {
            System.out.println("Product not found");
        }

        sc.close();
    }
}












