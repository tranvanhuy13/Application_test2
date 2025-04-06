package duy;

public class duy {
    public int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        duy calc = new duy(); // Changed from Calculator to duy
        int result = calc.plus(7, 5);
        System.out.println("Result: " + result); // Output: Result: 12
    }
}