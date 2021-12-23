import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData(){
         return  new  Object [][] {
                 {"1","0","1","+"},
                 {"0","1","1","-"},
                 {"99","3","33","*"}
        };
    }

    @Test(dataProvider = "positiveData" )
    public void positiveDataTest(String result, String a, String b, String c ){

        Assert.assertEquals(result,Calculator.execute(new String[]{a,c,b}),"Значения не равны");
    }
}
