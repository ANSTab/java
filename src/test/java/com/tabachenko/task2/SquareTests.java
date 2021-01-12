package com.tabachenko.task2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {
    @Test
    public void testArea(){
        Figure figure = new Rectangle(6, 6);
        //assert figure.area()==36;
        Assert.assertEquals(figure.area(),36);

    }
}
