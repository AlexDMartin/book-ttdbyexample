package com.soarin.moneyapp.test;

import static org.junit.Assert.*;
import com.soarin.moneyapp.currencies.Dollar;
import org.junit.Test;

public class TestsMoneyApp {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar product = five.times(2);
    assertEquals(10, product.amount);
    product = five.times(3);
    assertEquals(15, product.amount);
  }

}
