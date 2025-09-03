package CubeClass;

public class Cube {
	
	int length, width, height;
	
	Cube() {
		
		length = width = height = 6;
		
	}
	
	Cube(int a, int b, int c) {
		
		length = a;
		width = b;
		height = c;
	
	}
	
	Cube(Cube c) {
		
		length = c.length;
		width = c.width;
		height = c.height;
		
	}
	
	public int display() {
		
		return length * width * height;
		
	}
	
}
