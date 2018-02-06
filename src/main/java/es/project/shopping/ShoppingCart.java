package es.project.shopping;

import java.util.Collection;

public class ShoppingCart {

	private Collection<Integer> prices;

	public ShoppingCart(Collection<Integer> prices) {
		super();
		this.prices = prices;
	}

	public int calculateTotalPriceLambda() {
		return this.prices.stream().mapToInt(precio -> precio.intValue()).sum();
	}

	public int calculateTotalPriceRefMethod() {
		return this.prices.stream().mapToInt(Integer::intValue).sum();
	}

	/**
	 * Aplica un 5% de descuento a los productos con precio mayor que
	 * priceProduct
	 * 
	 * @param priceProduct
	 * @return
	 */
	public long calculateTotalDiscountLambda(int priceProduct) {
		long totalDiscount = 0;
		Long countProducts = this.prices.stream().filter(price -> price.intValue() >= priceProduct).count();
		totalDiscount = (priceProduct * 5 / 100) * countProducts;
		return totalDiscount;
	}

	public boolean detectErrorAnyMatch() {
		return this.prices.stream().anyMatch(precio -> precio.intValue() < 0);
	}

	public boolean detectErrorFindAny() {
		return this.prices.stream().filter(precio -> precio.intValue() < 0).findAny().isPresent();
	}

	public boolean detectErrorAnyMatchParallel() {
		return this.prices.parallelStream().anyMatch(precio -> precio.intValue() < 0);
	}

	public boolean detectErrorFindAnyParallel() {
		return this.prices.parallelStream().filter(precio -> precio.intValue() < 0).findAny().isPresent();
	}

	public boolean detectErrorFindFirstParallel() {
		return this.prices.parallelStream().filter(precio -> precio.intValue() < 0).findFirst().isPresent();
	}

	public int countProducts() {
		return prices.size();
	}

}
