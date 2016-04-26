package ua.goit.java;

/**
 * Created by Администратор on 25.04.16.
 */
import CalculatorLibrary.*;
public class ImplementationSqrt implements Calculator {
   public String calculate(String input) throws Exception
   {
    if(!new StringToNumberValidator().isValid(input))
        throw new Exception();
       String result = new String();
       result+= Math.sqrt(Double.parseDouble(input));

     return result;
   }
}
