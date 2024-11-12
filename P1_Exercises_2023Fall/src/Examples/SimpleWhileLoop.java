package Examples;

public class SimpleWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "J,a,v,a";
		String[] itemArray = text.split(",");
		for (String item : itemArray) {
		 System.out.println(item);
		}
	}

}
