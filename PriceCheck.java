package com.org.pc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PriceCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products = { "eggs", "milk", "cheese" };
		float[] productPrices = { 2.89F, 3.29F, 5.79F };
		String[] productSold = { "eggs", "eggs", "cheese", "milk" };
		float[] soldPrice = { 2.89F, 2.99F, 5.97F, 3.29F };

		List<String> productsItems = new ArrayList(Arrays.asList(products));
		List<Float> productPricesPricesItem = addFloatsToArray(productPrices);
		List<String> produtSoldItems = new ArrayList(Arrays.asList(productSold));
		List<Float> ProductSoldPrices = addFloatsToArray(soldPrice);
		int count = 0;

		Set<String> store = new HashSet<>();

		for (String aItems : produtSoldItems) {
			int prod = productsItems.indexOf(aItems);
			float prodPrc = productPricesPricesItem.get(prod);
			int prodSold = produtSoldItems.indexOf(aItems);
			float prodSoldPrc = ProductSoldPrices.get(prodSold);
			if (prodPrc != prodSoldPrc || store.add(aItems) == false) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static List addFloatsToArray(float[] items) {
		List<Float> lst = new ArrayList<>();
		for (float item : items) {
			lst.add(item);
		}
		return lst;
	}
}
