public class Customer{
	private int type;

	public Customer(String customerType){
		type=customerType.equals("Regular")?0:1;
	}

	public int getType(){
		return type;
	}
}
