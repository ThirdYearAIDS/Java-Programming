package LambdaExpressions;

interface Lambda1 {
	void NoParams();
    //void someParams(int a, int b);
}

interface Lambda2 {
	void oneParam(int x);
}

interface Lambda3 {
	void manyParams(int a, int b, int c);
}

public class Lambda_Expressions {

	public static void main(String[] args) {

		Lambda1 l1 = () -> System.out.println("This lambda expression has no parameters.");
        //Lambda1 l4 = (a, b) -> System.out.println("A + B = " + (a + b));
		l1.NoParams();
        //l4.someParams(5, 7);
		
		Lambda2 l2 = x -> System.out.println("The value of 'x' is " + x);
		l2.oneParam(10);

		Lambda3 l3 = (a,b,c) -> System.out.println("Sum of variables = " + (a + b + c));
		l3.manyParams(2, 3, 5);
		
	}

}
