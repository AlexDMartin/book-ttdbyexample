package com.soarin.moneyapp.currencies;

public class Money {
  
  protected int amount;
  
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Money)){
      return false;
    }
    Money money = (Money) object;
    return this.amount == money.amount;
  }
}
