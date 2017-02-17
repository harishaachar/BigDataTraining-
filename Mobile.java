public class Mobile {	
	private String manufacturer;
	private String operating_system;
	public String model;
	private int cost;
	//Constructor to set properties/characteristics of object
	Mobile(String man, String o,String m, int c){
		this.manufacturer = man;
		this.operating_system=o;
		this.model=m;
		this.cost=c;
	}
	//Method to get access Model property of Object
	public String getModel(){
		return this.model;
	}
	// We can add other method to get access to other properties
}