import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CalculatorTest2 {
    private CalculatorService service;
    private Calculator calculator;



    @BeforeAll
    public static void setUpClass() throws Exception{
        System.out.println("Method would be executed just once");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Method before the test");
        service = Mockito.mock(CalculatorService.class);
        calculator = new Calculator(service);
    }

    @Test
    public void testUpdate() throws FileNotFoundException {
        System.out.println("Inside void method test");
        Calculator calculator = new Calculator();
        calculator.out = Mockito.spy(new PrintStream("text.txt"));
        calculator.update();
        Mockito.verify(calculator.out, Mockito.times(2)).println("Hello");
    }

}