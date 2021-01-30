import java.util.ArrayList;
import java.util.List;

public  class meal {

	private List<item> items = new ArrayList <item>();

	public void addItem(item i){items.add(i);}

	public float getCost(){ 
		float cost =0.0f;

		for (item i : items)
			cost+=i.price();
		return cost;
	
	}

	public void showItems(){
		
		for (item i : items){
			System.out.println("Item : "+ i.name());
			System.out.println("Packing : "+ i.packing().pack());
			System.out.println("Price : "+ i.price());
		}
	}
}
