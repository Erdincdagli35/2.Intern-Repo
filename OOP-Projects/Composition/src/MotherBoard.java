
public class MotherBoard {

	private String model, productCompany, OS;

	public MotherBoard(String model, String productCompany, String oS) {
		this.model = model;
		this.productCompany = productCompany;
		this.OS = oS;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		this.OS = oS;
	}

	public void loadOS(String Os) {
		System.out.print("OS has loaded " + Os);
	}
}
