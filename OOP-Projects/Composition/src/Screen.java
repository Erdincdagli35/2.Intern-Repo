
public class Screen {

	private String model,productCompany,size;
	private Resolution resolution;
	
	public Screen(String model, String productCompany, String size, Resolution resolution) {
		this.model = model;
		this.productCompany = productCompany;
		this.size = size;
		this.resolution = resolution;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
	
	public void closeScreen() {
		System.out.println("Screen is closing ...");
	}
}
