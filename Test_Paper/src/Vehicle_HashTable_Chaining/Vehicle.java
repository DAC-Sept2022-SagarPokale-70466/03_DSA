/**
* @Developer : Sagar_Pokale
* 04-Nov-2022 5:38:59 PM
**/

package Vehicle_HashTable_Chaining;
public class Vehicle {
	private String company;
	private String model;
	private String type;
	private double price;
	private int no;
	private String color;

	public Vehicle(String company, String model, String type, double price, int no, String color) {
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.no = no;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", model=" + model + ", type=" + type + ", price=" + price + ", no=" + no
				+ ", color=" + color + "]";
	}	
}
