package oops.encapsulation.demo3;

public class Main {

	public static void main(String[] args) {

		Category communication = new Category();
		communication.setCategoryId(1000);
		communication.setCategoryName("communication");
		System.out.println(communication.getCategoryId());
		System.out.println(communication.getCategoryName());

		Category entertainment = new Category();
		entertainment.setCategoryId(1000);
		entertainment.setCategoryName("communication");
		System.out.println(entertainment.getCategoryId());
		System.out.println(entertainment.getCategoryName());

		Product iphone = new Product();
		iphone.setProductId(1);
		iphone.setProductName("Iphone 15 256Gb");
		iphone.setCategory(communication);
		System.out.println(iphone.getProductId());
		System.out.println(iphone.getProductName());
		Category iphoneCategory = iphone.getCategory();
		System.out.println(iphoneCategory.getCategoryName());

		Product oneples = new Product();
		oneples.setProductId(1);
		oneples.setProductName("oneples 9R 256Gb");
		System.out.println(oneples.getProductId());
		System.out.println(oneples.getProductName());
	}

}
