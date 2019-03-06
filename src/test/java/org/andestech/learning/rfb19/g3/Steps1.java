package org.andestech.learning.rfb19.g3;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.То;
import org.testng.Assert;

public class Steps1 {

    @Before
    public void initSteps(){
        System.out.println("+++ init scen: " + this);
    }

    @After
    public void afterSteps(){
        System.out.println("--- exit scen: " + this);
    }

    private int a,b;

    @Если("даны/дано два числа {int} и {int}")
    public void даны_два_числа_и(Integer a, Integer b) {
        // Write code here that turns the phrase above into concrete actions
        this.a = a;
        this.b = b;
        System.out.printf("a=%d, b=%d\n",a,b);
    }

    @То("их сумма равна {int}")
    public void их_сумма_равна(Integer summa) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(a+b, summa+0);
    }

}
