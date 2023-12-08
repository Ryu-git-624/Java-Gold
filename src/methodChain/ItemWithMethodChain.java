package methodChain;

public class ItemWithMethodChain {
	private String Id;
	private String Name;
	private String Description;
	private int Price;
	
	public ItemWithMethodChain Id(String id) {
		Id = id;
		return this;
	}
	
	public ItemWithMethodChain Name(String name) {
		Name = name;
		return this;
	}
	
	public ItemWithMethodChain Description(String description) {
		Description = description;
		return this;
	}
	
	public ItemWithMethodChain Price(int price) {
		Price = price;
		return this;
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
