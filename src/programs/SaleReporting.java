//package programs;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public  class SaleReporting implements ISaleReporting  {
//   
//	List<Sale> sales= new ArrayList<Sale>();
//	@Override
//	public void AddSale(Sale sale) {
//		// TODO Auto-generated method stub
//		sales.add(sale);
//		
//	}
//
//	@Override
//	public int TotalSaleAmountPerProduct(int productId) {
//		
//		return (int) sales.stream().filter(s-> s.Product.Id==productId).mapToInt(s->s.Amount).count();
//		
//				
//	}
//
//	@Override
//	public int TotalSaleAmountOnDate(LocalDateTime date) {
//		  return (int) sales.stream().filter(s-> s.Date==date).mapToInt(s->s.Amount).count();
//		 
//		
//	}
//
//	@Override
//	public List<Sale> GetSales(int productId) {
//		return sales.stream().filter(s-> s.Product.Id==productId).collect(Collectors.toList());
//	}
//}
