package com.soarin.moneyapp.currencies;

public class Dollar {

  private int amount;
  
  public Dollar(int amount) {
    this.amount = amount;
  }
  
  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
  
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Dollar)){
      return false;
    }
    Dollar dollar = (Dollar) object;
    return this.amount == dollar.amount;
  }
}
