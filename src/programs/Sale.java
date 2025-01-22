package programs;

import java.time.LocalDateTime;

public class Sale {
	    public Product Product;
	    public int Amount;
	    public LocalDateTime Date;
	
	    public Product getProduct() {
			return Product;
		}

		public void setProduct(Product product) {
			Product = product;
		}

		public int getAmount() {
			return Amount;
		}

		public void setAmount(int amount) {
			Amount = amount;
		}

		public LocalDateTime getDate() {
			return Date;
		}

		public void setDate(LocalDateTime date) {
			Date = date;
		}

		public Sale(Product product, int amount, LocalDateTime date)
	    {
	        Product = product;
	        Amount = amount;
	        Date = date;
	    }
	}



