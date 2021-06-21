package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    public void init(){
        System.out.println("----------------");
        System.out.println("Iitialisation apres chaque test");
        this.calculator = new Calculator ();
            }
            @Test
            public void should_add_two_numbers(){
               int a=2;
               int b=3;

                short result = 0;
                Assertions.assertEquals(result, Calculator.add(a,b));
            }
            @Test
            public void should_multi_two_numbers(){
                int a=3;
                int b=2;

                short result = 0;
                Assertions.assertEquals(result, Calculator.multi(a*b));
            }
            @Test
            public void should_substract_two_numbers(){
                    int a=3;
                    int b=2;

                    short result = 0;
                    Assertions.assertEquals(result, Calculator.substract(a-b));
             }
            @Test
            public void should_div_two_numbers(){
                    int A=3;
                    int B=2;

                    short result = 0;
                    Assertions.assertEquals(result, Calculator.div(A/B));
            }

}



