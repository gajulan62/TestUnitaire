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
       int A=2;
       int B=3;

        short result = 0;
        Assertions.assertEquals(result, Calculator.add(A,B));
    }

    public void should_substract_two_numbers(){
        // TODO
    }


}
