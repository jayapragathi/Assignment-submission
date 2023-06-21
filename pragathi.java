import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Spark.port(8080);

        
        Spark.get("/api/total_items", getTotalItems);
    }

   
    private static Route getTotalItems = (Request request, Response response) -> {
        
        LocalDate startDate = LocalDate.parse(request.queryParams("start_date"));
        LocalDate endDate = LocalDate.parse(request.queryParams("end_date"));
        String department = request.queryParams("department");

        
        if (startDate == null || endDate == null || department.isEmpty()) {
            response.status(400);
            return "Missing required parameters";
        }

        
        int totalItems = calculateTotalItems(startDate, endDate, department);

        
        return String.valueOf(totalItems);
    };

    private static int calculateTotalItems(LocalDate startDate, LocalDate endDate, String department) {
        
        int totalItems = 100;

        return totalItems;
    }
}