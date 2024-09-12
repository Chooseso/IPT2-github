public class Calculator {
    public static double add (double a, double b){
        return a + b;
    }
    public static double subtract (double a, double b){
        return a - b;
    }
    public static double multiply (double a, double b){
        return a * b;
    }
    public static double divide (double a, double b){
        return a / b;
    }
    public static double modulus (double a, double b){
        return a % b;
    }

    public static void main (String[] args){
        System.out.println("Simple Calculator");
        System.out.println("Addition: " + add(4,2));
        System.out.println("Subtraction: " + subtract(9,6));
        System.out.println("Multiplication: " + multiply(6,9));
        System.out.println("Division: " + divide(10,5));
        System.out.println("Modulus: " + modulus(12,5));
        
    }
}