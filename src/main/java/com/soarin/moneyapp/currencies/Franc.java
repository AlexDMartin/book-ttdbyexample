package com.soarin.moneyapp.currencies;

public class Franc {

  private int amount;
  
  public Franc(int amount) {
    this.amount = amount;
  }
  
  public Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
  
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Franc)){
      return false;
    }
    Franc franc = (Franc) object;
    return this.amount == franc.amount;
  }
}
