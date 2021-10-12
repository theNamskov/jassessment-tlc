package tech.thenamskov.parisbank.product;

public abstract class Product implements ProductPricingService {
  
  private double value;

  double value() {
    return value;
  }

  protected void setValue(double value) {
    this.value = value;
  }
  
  public double price(String exchange, String ticker) {
    return value();
  }

  public double price(String exchange, String contractCode, int month, int year) {
    return value();
  }

  public double price(String exchange, String ticker, int validForDays) {
   return value();

  }
}