package oops.encapsulation.demo3;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category();
		category1.setCategoryId(1000);
		category1.setCategoryName("Communication");

		Category entertainment = new Category();
		entertainment.setCategoryId(2000);
		entertainment.setCategoryName("Entertainment");

		Product iphone = new Product();
		iphone.setProductId(1);
		iphone.setProductName("IPhone 15 256GB");
		iphone.setCategory(category1);
		// System.out.println(iphone);
		System.out.println(iphone.getProductId());
		System.out.println(iphone.getProductName());
		Category iphoneCategory = iphone.getCategory();
		System.out.println(iphoneCategory.getCategoryName());

		Product tv = new Product();
		tv.setProductId(2);
		tv.setProductName("Sony LED TV");
		tv.setCategory(entertainment);
		// System.out.println(tv);

	}

}
