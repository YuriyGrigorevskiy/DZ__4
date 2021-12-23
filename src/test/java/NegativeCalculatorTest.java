import model.Calculator;
import model.CalculatorException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NegativeCalculatorTest {

    @DataProvider
    public Object[][] negativeData(){
        return  new  Object [][] {
                {"-1","0","-101","+"},
                {"0","2","0","-"},
                {"1000","50","2","*"},
        };
    }

    @Test(dataProvider = "negativeData" )
    public void negativeDataTest (String result, String a, String b, String c) throws CalculatorException {

       if(a.equals("") && b.equals("") & a.equals("0") || c.equals("/")){
           throw new CalculatorException("CalculatorException");
       }
       else{
           Assert.assertNotEquals(result,Calculator.execute(new String[]{a,c,b}),"Значения равны");
       }
    }
}
