package Assign3day8;

import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;






public class ToyStock {
	private List<ToyHub> toySt;

    public ToyStock() {
        toySt = new ArrayList<ToyHub>();
        
        
     }
    
    //List the Stock
    
    public void listStock() {
        toySt.forEach(toy -> System.out.println(toy));
        }
    //Filter the stock by category
    public void filterByCategory(String category) {
        toySt.stream().filter(toy -> toy.getCategory().equalsIgnoreCase(category)).forEach(System.out::println);
            }
    
    //List toys by Price Range 500 to 100
    public void listByPrice(double minPrice, double maxPrice) {
        toySt.stream().filter(toy -> toy.getPrice() >= minPrice && toy.getPrice() <= maxPrice).forEach(System.out::println);
        }
    //sort toys by price category
    public void sortbyPriceCategory() {
    	Map<String,List<ToyHub>> toysByCat = toySt.stream().collect(Collectors.groupingBy(ToyHub::getCategory));
    	
    	toysByCat.forEach((category,toys) -> {
    		System.out.println("Category:" +category);
    		toySt.stream().sorted(Comparator.comparingDouble(ToyHub::getPrice)).forEach(System.out::println);
    	});
    }
    //list old stock more than one year
    public void listOldStock() {
        YearMonth currentDate = YearMonth.now();
        int currentYear = currentDate.getYear();
        
        toySt.stream().filter(toy -> (currentYear - toy.getPurchaseYear()) > 1).forEach(System.out::println);
        
        }
    //group by category and count them
    public void groupToysCategoryandCount() {
    	Map<String,Long>  toyCountbyCat = toySt.stream().collect(Collectors.groupingBy(ToyHub::getCategory, Collectors.counting()));
    	
    	toyCountbyCat.forEach((category,cnt) -> 
    		System.out.println("Category:" +category+ "Count: " +cnt));
    		
    	}
    public void mostAndLeastExpensive(String category) {
    	Optional<ToyHub> mostexp = toySt.stream().filter(toy -> toy.getCategory().equalsIgnoreCase(category)).max(Comparator.comparingDouble(ToyHub::getPrice));
    	
    	Optional<ToyHub> leastexp = toySt.stream().filter(toy -> toy.getCategory().equalsIgnoreCase(category)).min(Comparator.comparingDouble(ToyHub::getPrice));
    	
    	mostexp.ifPresent(toy -> System.out.println("Most expensive Toy in "+category+ "is"+toy));
    	leastexp.ifPresent(toy -> System.out.println("Least expensive Toy in "+category+ "is"+toy));
    }
    public void totalToysinStockforAgeGroup() {
    	Map<Integer ,Long>toyCountbyAge = toySt.stream().collect(Collectors.groupingBy(ToyHub::getAge, Collectors.counting()));
    	toyCountbyAge.forEach((age,cnt) -> 
		System.out.println("Age: " +age+ "Count: " +cnt));
    	
    }
    
    public void addToy(ToyHub toy) {
    	toySt.add(toy);
    }
    
    }
        
    
    
    

