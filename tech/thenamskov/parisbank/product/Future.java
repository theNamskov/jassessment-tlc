package tech.thenamskov.parisbank.product;


public class Future extends Product {

  private String exchange,
                 contractCode;
  
  private int month,
              year;

  public Future(String exchange, String contractCode, int month, int year) {
    this.exchange = exchange;
    this.contractCode = contractCode;
    this.month = month;
    this.year = year;
  }

  public String exchange() {
    return exchange;
  }

  public String contractCode() {
    return contractCode;
  }

  public int month() {
    return month;
  }

  public int year() {
    return year;
  }
}