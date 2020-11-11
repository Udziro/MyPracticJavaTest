package AutoTestJava2;
import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;



public class SimpleTest {
    Calculator cals = new Calculator();



    @Test
    public void resultAdd(){
        int actualResult = cals.add(8, 6);
        assertEquals("Error",14, actualResult);
    }

    @Test
    public void resultSubstation(){
        int actualResult = cals.substation(9,12);
        assertEquals(-3,actualResult);
    }

    @Test
    public void resultMultiplication(){

        int actualResult = cals.multiplication(84,15);
        if (actualResult == 1260)
        {
            System.out.println("Test passed " + actualResult);
        }else{
            System.out.println("Test false");
        }
    }

    @Test
    public void resultAdvision(){
        double actualResult = cals.division(3.0d,2.0d);
        assertEquals(1.5d,actualResult,0.0001);
    }
    @Test
    public void resultSqearRoot(){
        double actualResult = cals.squareRoot(7.0d);
//        System.out.println(actualResult);
        assertEquals(2.6457513110645907d,actualResult,0.00001);
    }


    @Test
    public void resultScalbl(){
        double  actualResult = cals.scalbl(9);
//        System.out.println(actualResult);
        assertEquals(36.d,actualResult,0);
    }
//    @Test
//    public void summaC(){
//        int a = 4;
//        int b = 4;
//
//        int c = a > b ? 100:200;
//        System.out.println(c);
//    }
//    @Test
//    public void summXY(){
//        int x = 1, y = 6;
//
//
//        while(x == 1 && y == 6)
//
//        {
//
//            x++;
//            y--;
//        }
//
//        System.out.println("x = " + x +" y = " + y);

    }
//
//}

