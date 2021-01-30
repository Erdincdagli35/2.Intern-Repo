
public class mainDemo {
	/*
	public static<E> void print(E[] array) {
		
		for(E temp :array)
			System.out.println(temp);
	}*/
	public static <E extends Participant> E topOne(E n1,E n2,E n3) {
		if (n1.calucatePoint()>n2.calucatePoint() && n1.calucatePoint()>n3.calucatePoint()) {
			return n1;
		}
		else if (n2.calucatePoint()>n1.calucatePoint() && n2.calucatePoint()>n3.calucatePoint()) {
			return n2;
		}
		else if (n1.calucatePoint()<n3.calucatePoint() && n1.calucatePoint()<n3.calucatePoint()) {
			return n3;
		}
		else {
			return n3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO");
		
		//Arrays
		/*Character[] charArray = {'E','R','D','Ý'};
		Integer[] intArray= {1,2,3,4};
		String[] strArray= {"Kadir","Emre","Erdinç","Emine"};	
		Student[] stuArray= {new Student("Beyza"),new Student("Dilara")};
		*/
		/*
		PrintClass<Character> pc1 = new PrintClass();
		PrintClass<Integer> pc2 = new PrintClass();
		PrintClass<String> pc3 = new PrintClass();
		PrintClass<Student> pc4 = new PrintClass();
		
		pc1.print(charArray);
		pc2.print(intArray);
		pc3.print(strArray);
		pc4.print(stuArray);
		 */
		/*print(charArray);
		print(intArray);
		print(strArray);
		print(stuArray);
		*/
		Numerical n1= new Numerical(30,40,20,30,"Erdinç Daðlý");
		Numerical n2= new Numerical(25,45,2,35,"Emre Daðlý");
		Numerical n3= new Numerical(25,25,2,5,"Umut Çalýþkan");
		
		Verbal v1= new Verbal(11,22,20,2,"Mustafa Daðlý");
		Verbal v2= new Verbal(25,45,2,3,"Zergüzer Daðlý");
		Verbal v3= new Verbal(5,5,2,3,"Hande Çaðlar");
		
		Numerical topOneNum = topOne(n1,n2,n3);
		Verbal topOneVer = topOne(v1,v2,v3);
		
		System.out.println("On Numerical First One : "+topOneNum.toString());
		System.out.println("On Verbal First One : "+topOneVer.toString());
		
		
		
		
		System.out.println("BYE");
	}

}
