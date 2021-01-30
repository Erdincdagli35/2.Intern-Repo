public class SingletonDP{
	private static SingletonDP object;

	private SingletonDP(){}

	public static SingletonDP getInstance()
	{
		if(object==null){
			object = new SingletonDP();
		}
		return object;
	}
}
