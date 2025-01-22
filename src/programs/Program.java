//package programs;
//
//import java.time.LocalDateTime;
//import java.time.Month;
//
//public class Program
//{
//  public static void Main(String[]args)
//  {
//      // Create products
//      Product laptop = new Product(1, "Laptop");
//      Product smartphone = new Product(2, "Smartphone");
//
//      // Create sales
//      Sale sale1 = new Sale(laptop, 1500, LocalDateTime.of(2025, Month.JANUARY, 1,12,30));
//      Sale sale2 = new Sale(smartphone, 700, LocalDateTime.of(2025, Month.JANUARY, 2,12,30));
//      Sale sale3 = new Sale(laptop, 1200,  LocalDateTime.of(2025, Month.JANUARY, 3,12,30));
//      
//      //LocalDateTime specificDateTime = LocalDateTime.of(2024, Month.MARCH, 10, 12, 30);  
//
//
//      // Initialize SaleReporting system
//      SaleReporting saleReporting = new SaleReporting();
//     
//      
//      // Add sales to SaleReporting
//      saleReporting.AddSale(sale1);
//      saleReporting.AddSale(sale2);
//      saleReporting.AddSale(sale3);
//
//      // Calculate total sales on 1/3/2025
//      int totalSaleOnDate = saleReporting.TotalSaleAmountOnDate(LocalDateTime.of(2025, Month.JANUARY, 3,12,30));
//      //Console.WriteLine($"1/3/2025:{totalSaleOnDate}");
//      System.out.println(totalSaleOnDate);
//
//      // Calculate total sales for Laptop
//      int totalLaptopSales = saleReporting.TotalSaleAmountPerProduct(1);
//      //Console.WriteLine($"Laptop:{totalLaptopSales}");
//      System.out.println(totalLaptopSales);
//
//      // Calculate total sales for Smartphone
//      int totalSmartphoneSales = saleReporting.TotalSaleAmountPerProduct(2);
//      //Console.WriteLine($"Smartphone:{totalSmartphoneSales}");
//      System.out.println(totalSmartphoneSales);
//  }
//}
