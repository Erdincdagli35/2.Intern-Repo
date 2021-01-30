public class Context{
	private Strategy s;

	public Context(Strategy s){this.s=s;}
	public int execute(int number1,int number2){
		return s.doMathOperation(number1,number2);
	}
}
