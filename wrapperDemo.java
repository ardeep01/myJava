//Program to show the use of various Wrapper Classes(Converting an object into primitive).
public class wrapperDemo {
    public static void main(String[] args) {
        // Convert Integer object to int primitive
        Integer intObj = 100;
        int intPrimitive = intObj.intValue(); // Using intValue() method
        int autoUnboxedInt = intObj; // Auto-unboxing

        // Convert Character object to char primitive
        Character charObj = 'A';
        char charPrimitive = charObj.charValue(); // Using charValue() method
        char autoUnboxedChar = charObj; // Auto-unboxing

        // Convert Boolean object to boolean primitive
        Boolean boolObj = true;
        boolean boolPrimitive = boolObj.booleanValue(); // Using booleanValue() method
        boolean autoUnboxedBool = boolObj; // Auto-unboxing

        // Convert Double object to double primitive
        Double doubleObj = 99.99;
        double doublePrimitive = doubleObj.doubleValue(); // Using doubleValue() method
        double autoUnboxedDouble = doubleObj; // Auto-unboxing

        // Printing the values
        System.out.println("Integer Object to int: " + intPrimitive);
        System.out.println("Auto-Unboxed int: " + autoUnboxedInt);
        System.out.println("Character Object to char: " + charPrimitive);
        System.out.println("Auto-Unboxed char: " + autoUnboxedChar);
        System.out.println("Boolean Object to boolean: " + boolPrimitive);
        System.out.println("Auto-Unboxed boolean: " + autoUnboxedBool);
        System.out.println("Double Object to double: " + doublePrimitive);
        System.out.println("Auto-Unboxed double: " + autoUnboxedDouble);
    }
}
