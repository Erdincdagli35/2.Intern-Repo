
public class ComputerCase {

	private String model,productCompany,material;

	public ComputerCase(String model, String productCompany, String material) {
		this.model = model;
		this.productCompany = productCompany;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void openPC() {
		System.out.println("PC is opening ...");

	}
}
