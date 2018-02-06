package es.project.shopping;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTests {

	private final Integer TOTAL_SIZE = 10;
	private final Integer NUMBER_ADD = 5;

	@Test
	public void shouldCalculateTotalPriceLambda() throws Exception {
		CartBuilder cartBuilder = new CartBuilder(60, 5);
		ShoppingCart shoppingCart = cartBuilder.build();
		Assert.assertEquals(300, shoppingCart.calculateTotalPriceLambda());
	}

	@Test
	public void shouldCalculateTotalPriceRefMethod() throws Exception {
		CartBuilder builder = new CartBuilder(60, 5);
		ShoppingCart shoppingCart = builder.build();
		Assert.assertEquals(300, shoppingCart.calculateTotalPriceRefMethod());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatch() {
		CartBuilder builder = new CartBuilder(TOTAL_SIZE, NUMBER_ADD);
		builder.add((int) -1L);
		builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
		ShoppingCart shoppingCart = builder.build();
		Assert.assertTrue(shoppingCart.detectErrorAnyMatch());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAny() {
		CartBuilder builder = new CartBuilder(TOTAL_SIZE, NUMBER_ADD);
		builder.add((int) -1L);
		builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
		ShoppingCart shoppingCart = builder.build();
		Assert.assertTrue(shoppingCart.detectErrorFindAny());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatchParallel() {
		CartBuilder builder = new CartBuilder(TOTAL_SIZE, NUMBER_ADD);
		builder.add((int) -1L);
		builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
		ShoppingCart shoppingCart = builder.build();
		shoppingCart.detectErrorAnyMatchParallel();
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAnyParallel() {
		CartBuilder builder = new CartBuilder(TOTAL_SIZE, NUMBER_ADD);
		builder.add((int) -1L);
		builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
		ShoppingCart shoppingCart = builder.build();
		Assert.assertTrue(shoppingCart.detectErrorFindAnyParallel());
	}

	@Test
	public void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindFirstParallel() {
		CartBuilder builder = new CartBuilder(TOTAL_SIZE, NUMBER_ADD);
		builder.add((int) -1L);
		builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
		ShoppingCart shoppingCart = builder.build();
		Assert.assertTrue(shoppingCart.detectErrorFindFirstParallel());

	}

}
