package ua.goit.java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import CalculatorLibrary.*;


/**
 * Created by Администратор on 22.04.16.
 */

@Configuration
public class AppConfig {

    @Bean
    public Main main(/*ExecutorFactory executorFactory, */Calculator calculator)
    {
        Main main = new Main();
      //  main.setExecutorFactory(executorFactory);
        main.setCalculator(calculator);
        return main;
    }

   @Bean
    public Calculator calculatorAddSubstract()
    {
        Calculator calculator = new ImplementationAddSubstract();
        return new ImplementationAddSubstract();
    }


}
