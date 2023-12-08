package methodChain;

public class ItemWithConstructor {
	private String Id;
	private String Name;
	private String Description;
	private int Price;
	
	public ItemWithConstructor(String id, String name, String description, int price) {
		super();
		Id = id;
		Name = name;
		Description = description;
		Price = price;
	}

	public String getId() {
		return Id;
	}

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return Description;
	}

	public int getPrice() {
		return Price;
	}
	
	

}
