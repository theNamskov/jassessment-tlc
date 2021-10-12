package tech.thenamskov.parisbank.product;


import tech.thenamskov.parisbank.pricing.*;

public abstract class Product implements ProductPricingService {
  
  
  double price(String exchange, String ticker) {
    throw new NotImplementedException("Not allowed for this product.");
  }

  double price(String exchange, String contractCode, int month, int year) {
    throw new NotImplementedException("Not allowed for this product.");
  }

  double price(String exchange, String ticker, int validForDays) {
    throw new NotImplementedException("Not allowed for this product.");
  }
}