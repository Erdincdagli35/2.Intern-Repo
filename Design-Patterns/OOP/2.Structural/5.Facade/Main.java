public class Main{
	public static void main(String []args){
		
		Instrument i = new Guitar();
		InstrumentKeeper ik = new InstrumentKeeper();
		i.toPrint();
		ik.guitarSale();

		Instrument i2 = new Piano();                                                        InstrumentKeeper ik2 = new InstrumentKeeper();                                      i2.toPrint();                                                                       ik2.pianoSale(); 
	}
}
