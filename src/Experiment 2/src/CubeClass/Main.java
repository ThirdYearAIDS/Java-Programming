package CubeClass;

public class Main {

	public static void main(String[] args) {
		
		Cube c1 = new Cube();
		Cube c2 = new Cube(5, 7, 12);
		Cube c3 = new Cube(c2);
	
		System.out.println("Volume of c1: " + c1.display());
		System.out.println("Volume of c2: " + c2.display());
		System.out.println("Volume of c3: " + c3.display());
	
	}

}
