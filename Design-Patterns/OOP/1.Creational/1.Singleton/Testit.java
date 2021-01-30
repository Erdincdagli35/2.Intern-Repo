class Testit{
	public static void main(String [] args){
		SingletonDP sExample = SingletonDP.getInstance();
		System.out.println("Singleton Result : "+sExample);

		SingletonDP sExample2 = SingletonDP.getInstance();                                              System.out.println("2.Singleton Result : "+sExample2);

		System.out.println(sExample==sExample2);
	}
}
