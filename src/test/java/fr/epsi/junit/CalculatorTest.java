package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;
    private Assertions Assert;

    @BeforeEach
    public void init() {
        System.out.println("----------------");
        System.out.println("Initialisation après chaque tests");
        this.calculator = new Calculator();
    }

    @Test
    public void should_add_two_numbers() {
        int a = 2;
        int b = 3;

        int result = a+b;
        Assertions.assertEquals(result, Calculator.add(a, b));

    }

    @Test
    public void should_substract_two_numbers() {
        int a = 3;
        int b = 2;

        int result = a-b;
        Assertions.assertEquals(result, Calculator.substract(a, b));
    }

    @Test
    public void should_multi_two_numbers() {
        int a = 3;
        int b = 2;

        int result = a*b;
        Assertions.assertEquals(result, Calculator.multi(a, b));
    }

    @Test
    public void should_div_two_numbers() {
        int a = 3;
        int b = 2;

        int result = a/b;
        Assertions.assertEquals(result, Calculator.div(a, b));

    }
    @Test
    public void should_tableau_add(){
        int nmbers[] = {1,2,3,4,5};
        // calculer d'un suite (n * n+1)/2
        int resultat = calculator.add(nmbers);
        Assertions.assertEquals(15, resultat);
    }

}



