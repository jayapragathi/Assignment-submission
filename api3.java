mport java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ItemController {
    
    private Map<String, Item> items;

    public ItemController() {
        
        items = new HashMap<>();
        items.put("item1", new Item("item1", 10, 100.0));  // Sample item with quantity 10 and price 100.0
        items.put("item2", new Item("item2", 5, 50.0));
        items.put("item3", new Item("item3", 15, 200.0));
        
    }

    public String getNthMostTotalItem(String itemBy, Date startDate, Date endDate, int n) {
        
        Map<String, Item> filteredItems = filterItemsByDateRange(startDate, endDate);

        
        Item[] sortedItems = sortItems(filteredItems, itemBy);

        
        if (n < 1 || n > sortedItems.length) {
            throw new IllegalArgumentException("Invalid value for 'n'.");
        }

       
        Item nthItem = sortedItems[n - 1];

        
        return nthItem.getName();
    }

    private Map<String, Item> filterItemsByDateRange(Date startDate, Date endDate) {
        
        return items;
    }

    private Item[] sortItems(Map<String, Item> filteredItems, String itemBy) {
        
        Item[] sortedItems = filteredItems.values().toArray(new Item[0]);
        
        return sortedItems;
    }

    
    private static class Item {
        private String name;
        private int quantity;
        private double price;

        public Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getPrice() {
            return price;
        }
    }
}