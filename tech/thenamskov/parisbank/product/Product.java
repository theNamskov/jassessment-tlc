package tech.thenamskov.parisbank.product;

public abstract class Product implements ProductPricingService {
  
  public static int count = 0;

  private double value;
  private int id;

  public double value() {
    return value;
  }

  public int id() {
    return id;
  }

  protected void setId() {
    id = ++count;
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