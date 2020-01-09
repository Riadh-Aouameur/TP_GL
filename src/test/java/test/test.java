package test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;


public class test {
    @When("^i am function ADD (\\d+) ,(\\d+)$")
    public int i_am_function_ADD(int arg1, int arg2) throws Throwable {


        return arg1+arg2;
    }

    @Then("^test of ADD$")
    public void test_of_ADD() throws Throwable {
        System.out.println("Number test = "+10+ " return function : "+i_am_function_ADD(5,5));
        assertEquals(10,i_am_function_ADD(5,5));
    }
    @When("^i am function FACT  (\\d+)$")
    public int i_am_function_FACT(int arg1) throws Throwable {
        if (arg1 == 0)
            return 1;

        return arg1*i_am_function_FACT(arg1-1);
    }

    @Then("^test of FACT$")
    public void test_of_FACT() throws Throwable {
        System.out.println("Number test = "+1+ " return function : "+i_am_function_FACT(1));
        assertEquals(1,i_am_function_FACT(1));
        System.out.println("Number test = "+6+ " return function : "+i_am_function_FACT(3));
        assertEquals(6,i_am_function_FACT(3));


    }

    @When("^i am function PSO \"([^\"]*)\"$")
    public int i_am_function_PSO( String arg2 ) throws Throwable {
        //System.out.println(arg2.indexOf('f'));
         return arg2.indexOf('f');

    }

    @Then("^test of PSO$")
    public void test_of_PSO() throws Throwable {
        System.out.println("Number test = "+ 0 + " return function : "+i_am_function_PSO("first One"));
        assertEquals(0,i_am_function_PSO("first One "));
    }
    @When("^i am function ADD_BIN (\\d+) ,(\\d+)$")
    public String i_am_function_ADD_BIN(int first, int second) throws Throwable {
        int b1 = first;
        int b2 = second;
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    @Then("^test of ADD_BIN$")
    public void test_of_ADD_BIN() throws Throwable {
        System.out.println("Number test = "+ "11 " + "return function : "+i_am_function_ADD_BIN(2,1));
        assertEquals("11",i_am_function_ADD_BIN(2,1));


    }
    @When("^i am function MUL (\\d+) ,(\\d+)$")
    public String i_am_function_MUL(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        int sum = arg2 * arg1;
        return Integer.toBinaryString(sum);

    }

    @Then("^test of MUL$")
    public void test_of_MUL() throws Throwable {
        System.out.println("Number test = "+ "11001 " + "return function : "+i_am_function_MUL(5,5));
        assertEquals("11001",i_am_function_MUL(5,5));

    }
}
