package inheritance;
class parent{
	void add(int x,int y) {
		System.out.println("Add from parent "+(x+y));//parent
	}
}

public class Inheritance extends parent
//overrides com.accenture.pgm.parent.add
{
	//super keyword is used to refer immediate parent class
	
	void add(int x,int y) {
		//super.add(2,2);
		System.out.println("Add from child "+(x+y));//child
	}

	public static void main(String[] args) {
		//creating object to give access
		Inheritance i = new Inheritance();
		i.add(2, 2);
	}

}

