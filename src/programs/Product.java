package programs;

public class Product {
	
	
	    public  int Id;
	    public String Name;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}	
	    
	    
	    
	    public Product(int id, String name)
	    {
	        Id = id;
	        Name = name;
	    }
	}


