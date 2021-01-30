public class anatoliaTurkish implements turkishDictionary{

	turkishDictionary turkishD;

	@Override 
	public void convert(String word){
		if(word.equalsIgnoreCase("anatolia turkish")){
			System.out.println("Converted Anatolia Turkish : "+word);
		}
		else if(word.equalsIgnoreCase("usa")|| word.equalsIgnoreCase("uk")){
			//new turkishDictionary(word);
			System.out.println("Converted English : "+word);
		}
		else{
			System.out.println("is not converted");
		}
	}

}
