package core;

public class Calculator
{
    CalculatorService calculatorService;


    public Calculator(CalculatorService calculatorService)
    {
        this.calculatorService = calculatorService;
    }

    public int performAdd(int i , int j)
    {
        return calculatorService.add(i,j) ;
    }

    public int performSubtract(int i, int j)
    {

        return calculatorService.subtract(i, j);
    }

    public int performDivide(int i, int j)
    {

        return calculatorService.divide(i, j);
    }

    public int performMultiply(int i, int j)
    {
        return calculatorService.multiply( i,j);

    }
}
