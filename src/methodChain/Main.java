package methodChain;

public class Main {

	public static void main(String[] args) {
		ItemWithConstructor Item1 = new ItemWithConstructor("A001", "Constructor", "hoge", 10000);
		System.out.println(Item1.getId());
		System.out.println(Item1.getName());
		System.out.println(Item1.getDescription());
		System.out.println(Item1.getPrice());
		
		ItemWithMethodChain Item2 = new ItemWithMethodChain()
				.Id("A002")
				.Name("MethodChain")
				.Description("moge")
				.Price(20000);
		
		System.out.println(Item2.getId());
		System.out.println(Item2.getName());
		System.out.println(Item2.getDescription());
		System.out.println(Item2.getPrice());

	}

}
