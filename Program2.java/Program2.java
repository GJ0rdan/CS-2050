/*
 * Garret Jordan
 * Description:
 */
public class Program2 {


    // TODO #1: finish the method's implementation
    public static double add(double a, double b) {

        return a + b;
    }

    // TODO #2: finish the method's implementation
    public static double subtract(double a, double b) {

        return a - b;
    }

    // TODO #3: finish the method's implementation
    public static double multiply(double a, double b) {
        return a * b;
    }

    // TODO #4: finish the method's implementation
    public static double divide(double a, double b) {
        return a/b;
    }

    // TODO #5: finish the method's implementation - assume right triangle
    public static double sinOfAngle(double oppSide, double hyp) {
        return Math.sin(oppSide / hyp);
    }

    // TODO #6: finish the method's implementation - assume right triangle
    public static double hypOfTriangle(double sideA, double sideB) {
        return Math.sqrt((sideA*sideA) + (sideB*sideB));
    }


    public static void main(String[] args) {
        Program2Test program2Test = new Program2Test();
        program2Test.testZeroAddZero();

        program2Test.testNegativeAddPositive();

        System.out.println("Addition: " + add(3, 5));
        System.out.println("Subtraction: " + subtract(8, 3));
        System.out.println("Multiplication: " + multiply(2, 4));
        System.out.println("Division: " + divide(10, 2));
    }

        //System.out.print(program2Test.testZeroAddZero());
        //System.out.println(program2Test.testNegativeAddPositive());

    }
}
