package WrapperClasses;

public class WrapperClass {
    public static void main(String[] args) {
        
    	int primInt = 5;
        double primDouble = 5.7;
        char primChar = 'a';

        Integer wrapInt = primInt;
        Double wrapDouble = primDouble;
        Character wrapChar = primChar;

        System.out.println("intValue: " + wrapInt.intValue());
        System.out.println("doubleValue: " + wrapDouble.doubleValue());
        System.out.println("charValue: " + wrapChar.charValue());

        System.out.println("Integer toString: " + wrapInt.toString());
        System.out.println("Double toString: " + wrapDouble.toString());
        System.out.println("Char toString: " + wrapChar.toString());

        primInt = wrapInt;
        primDouble = wrapDouble;
        primChar = wrapChar;

        System.out.println("Unboxed int: " + primInt);
        System.out.println("Unboxed double: " + primDouble);
        System.out.println("Unboxed char: " + primChar);
        
    }
}
