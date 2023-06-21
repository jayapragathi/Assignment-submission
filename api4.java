import java.util.ArrayList;
import java.util.List;

public class SalesAPI {
    public static List<Double> getMonthlySales(String product, int year) {
        
        List<Double> monthlySales = new ArrayList<>();

        
        for (int month = 1; month <= 12; month++) {
            double salesAmount = generateSalesAmount(product, year, month);
            monthlySales.add(salesAmount);
        }

        return monthlySales;
    }

    
    private static double generateSalesAmount(String product, int year, int month) {
        
        return Math.random() * 1000; 

    
    public static void main(String[] args) {
        String product = "example_product";
        int year = 2023;

        List<Double> monthlySales = getMonthlySales(product, year);

        System.out.println("Monthly Sales for Product: " + product);
        System.out.println(monthlySales);
    }
}