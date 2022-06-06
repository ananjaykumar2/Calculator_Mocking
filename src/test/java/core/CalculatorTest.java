package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


class CalculatorTest {
Calculator calculator;

CalculatorService calculatorService = mock(CalculatorService.class);


   @BeforeEach
   public void setUp()
   {
       calculator = new Calculator(calculatorService);

   }
   @Test
    public void testPerformAdd()
   {

       when(calculatorService.add(2,2)).thenReturn(4);
       assertEquals(4 , calculator.performAdd(2,2));

       verify(calculatorService).add(2,2);
   }

   @Test
    public void testPerformSubtract()
   {
        when(calculatorService.subtract(4,2)).thenReturn(2);
        assertEquals(2, calculator.performSubtract(4,2));
        verify(calculatorService).subtract(4, 2);
   }

   @Test
    public void testPerformDivide()
   {
        when(calculatorService.divide(2, 4)).thenReturn(2);
       assertEquals(2, calculator.performDivide(2, 4));
       verify(calculatorService).divide(2,4);
   }


   @Test
    public void testPerformMultiply()
   {
        when(calculatorService.multiply(2,4)).thenReturn(8);
       assertEquals(8, calculator.performMultiply(2, 4));
       verify(calculatorService).multiply(2,4);
   }
}