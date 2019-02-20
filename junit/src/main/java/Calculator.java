import java.io.PrintStream;

public class Calculator{

    PrintStream out = System.out;

    static final int ZERO = 0;
    protected static final int ONE = 1;

    private CalculatorService service;

    public Calculator(CalculatorService service){
        this.service = service;
    }


    public int minus(int a, int b) {
        return service.minus(a,b);
    }

    public int divide(int a, int b){
        return a / b;
    }

    public Calculator() {
    }

    public void update(){
        out.println("Hello");
    }



}