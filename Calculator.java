public class Calculator {
    public static double add (double a, double b){
        return a + b;
    }
    public static double subtract (double a, double b){
        return a - b;
    }

    public static void main (String[] args){
        System.out.println("Simple Calculator")
        System.out.println("Addition: " + add(4,2));
        System.out.println("Subtraction: " + subtract(9,6));
        
    }
}