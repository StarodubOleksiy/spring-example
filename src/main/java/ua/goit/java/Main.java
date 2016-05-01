package ua.goit.java;

import CalculatorLibrary.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.ObjectFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;



public class Main {


    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void showResult(String calculateString,String result)
    {
        System.out.println(calculateString+" = "+result);
    }

    public void execute() {
        try
        {
            Calculator calculator = null;
            String calculateString = null;
            do {

                System.out.println("Enter the string you want to calculate or exit to exit program");
                BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
                calculateString = br.readLine().toLowerCase();
                if(calculateString.contains("+")||calculateString.contains("-")) {
                    calculator = new ImplementationAddSubstract();
                    String result =  calculator.calculate(calculateString);
                    this.showResult(calculateString,result);
                } else if (calculateString.contains("*") || calculateString.contains("/"))
                {
                    calculator = new ImplementationMultiplicationDivision();
                    String result =  calculator.calculate(calculateString);
                    this.showResult(calculateString,result);
                } else if (calculateString.contains("sqrt"))
                {
                    calculator = new ImplementationSqrt();
                    System.out.println("Enter the value you want to find sqrt: ");
                    String valueToSqrt = br.readLine();
                    String result =  calculator.calculate(valueToSqrt);
                    calculateString+=" ";
                    calculateString+=valueToSqrt;
                    this.showResult(calculateString,result);
                }   else if(!calculateString.equals("exit"))
                    throw new Exception();
            }while(!calculateString.equals("exit"));

            System.out.println("End program");


           } catch(Exception exp)
        {
            System.out.println(exp.toString());
        }
    }

//
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
       Main main = applicationContext.getBean("main",Main.class);
         main.execute();

    }

}
