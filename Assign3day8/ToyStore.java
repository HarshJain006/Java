package Assign3day8;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        ToyStock stock = new ToyStock();

        // Add sample toys
        stock.addToy(new ToyHub(101, "Toy Car", 500, 3, "Battery Operated", 5, 2022));
        stock.addToy(new ToyHub(102, "Lego Set", 1500, 8, "Educational", 3, 2021));
        stock.addToy(new ToyHub(103, "Puzzle", 300, 6, "Educational", 1, 2023));
        stock.addToy(new ToyHub(104, "Robot", 2000, 10, "Battery Operated", 11, 2021));
        stock.addToy(new ToyHub(105, "Doll", 700, 4, "Imaginative Play", 12, 2022));

        Scanner scanner = new Scanner(System.in);

        // 1. List all toys in stock
        System.out.println("All toys in stock:");
        stock.listStock();

        // 2. Filter by category
        System.out.println("\nEnter category to filter by:");
        String category = scanner.nextLine();
        System.out.println("Filtered toys by category:");
        stock.filterByCategory(category);

        // 3. List toys by price range
        System.out.println("\nListing toys between price range 500 to 1000:");
        stock.listByPrice(500, 1000);

        // 4. Sort the toys by price within each category
        System.out.println("\nToys sorted by price within each category:");
        stock.sortbyPriceCategory();

        // 5. List toys older than 1 year
        System.out.println("\nToys older than 1 year:");
        stock.listOldStock();

        // 6. Group toys by category and count them
        System.out.println("\nToys grouped by category and their count:");
        stock.groupToysCategoryandCount();

        // 7. Display most and least expensive toy in a category
        System.out.println("\nEnter category to find most and least expensive toy:");
        category = scanner.nextLine();
        stock.mostAndLeastExpensive(category);

        // 8. Total number of toys in stock for each age group
        System.out.println("\nTotal number of toys in stock for each age group:");
        stock.totalToysinStockforAgeGroup();

        scanner.close();
    }

	
}