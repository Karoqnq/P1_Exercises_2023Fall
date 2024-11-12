package week_10;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Item> itemList = new ArrayList<>();
	private DecimalFormat twoDecimals = new DecimalFormat("0.00");

	public ShoppingCart() {
	}

	public void add(Product product, int quantity) {

		Item newItem = new Item(product, quantity);
		itemList.add(newItem);
	}

	public void remove(Product product) {

		for (Item item : itemList) {

			if (item.getProduct().getNumber() == product.getNumber()) {
				itemList.remove(item);
				break;
			}
		}
	}

	public double getTotalPrice() {

		double totalPrice = 0;

		for (Item item : itemList) {
			totalPrice += item.getSubtotal();
		}

		return totalPrice;
	}

	public String toString() {

		if (itemList.isEmpty()) {
			return "There are no items in the shopping cart.\n";

		}

		String output = "=== Shopping cart ===\n";
		for (Item item : itemList) {

			Product product = item.getProduct();
			output += product.getNumber() + ": " + product.getName() + ", quantity: " + item.getQuantity()
					+ ", unit price: " + twoDecimals.format(product.getPrice()) + ", subtotal: " + twoDecimals.format(item.getSubtotal()) + "\n";
		}

		output += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()) + " euros\n";

		return output;
	}
}