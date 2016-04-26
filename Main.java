package CalculatorLibrary;


public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        System.out.println(new ImplementationAddSubstract().calculate("2+3"));
        System.out.println(new ImplementationAddSubstract().calculate("2-3"));
        System.out.println(new ImplementationMultiplicationDivision().calculate("2*3"));
        System.out.println(new ImplementationMultiplicationDivision().calculate("2/3"));
       // System.out.println(new ImplementationAddSubstract().calculate("2*3"));
    }
}
