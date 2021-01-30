public class adapterDictionary implements turkishDictionary{

	englishDictionary eD;

	public adapterDictionary(String word){
		if(word.equalsIgnoreCase("usa"))
			eD = new usa();
		else if (word.equalsIgnoreCase("uk"))
			eD = new uk();

	}

	@Override
	public void convert(String word){                                                   		if(word.equalsIgnoreCase("usa"))                                                         eD.convertAsUsa(word);                                                               else if (word.equalsIgnoreCase("uk"))                                                    eD.convertAsUk(word);                                                                                                                                                }   

} 
