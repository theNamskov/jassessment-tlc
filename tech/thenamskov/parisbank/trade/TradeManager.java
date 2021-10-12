package tech.thenamskov.parisbank.trade;

import java.util.*;

import tech.thenamskov.parisbank.exception.*;
import tech.thenamskov.parisbank.product.*;

public class TradeManager implements ParisTradedProducts {

  private ArrayList<Product> products = new ArrayList<Product>();
  private Map<Product, Integer> tradedProducts = new HashMap<>();

  public TradeManager() {

  }


  public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
    Product prod = products
      .stream().
      filter(p -> p.id() == product.id())
      .collect(ArrayList<Product>::new, ArrayList::add, ArrayList::addAll).get(0);

    if(prod != null) throw new ProductAlreadyRegisteredException(""+product.id());

    this.products.add(product);

  }


  public void trade(Product product, int quantity) {
    if(!products.contains(product)) return;

    if(!tradedProducts.containsKey(product)) { tradedProducts.put(product, quantity); return; }

    int topup = tradedProducts.get(product);
    tradedProducts.put(product, topup+quantity);
  }


  public int totalTradeQuantityForDay() {
    return tradedProducts
      .values()
      .stream()
      .mapToInt(val -> val)
      .reduce(0, (acc, i) -> acc + i);
  }


  public double totalValueOfDaysTradedProducts() {
    return tradedProducts
      .keySet()
      .stream()
      .mapToDouble(val -> val.value()*tradedProducts.get(val))
      .reduce(0.00, (acc, i) -> acc + i);
  }
  
}