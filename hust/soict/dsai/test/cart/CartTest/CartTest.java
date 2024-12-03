package hust.soict.dsai.test.cart.CartTest;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		// Tạo giỏ hàng
		Cart cart = new Cart();

		// Tạo các đối tượng Media
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 24.95f, 124, "George Lucas");

		Book book1 = new Book(3, "The Catcher in the Rye", "Fiction", 10.99f);
		Book book2 = new Book(4, "To Kill a Mockingbird", "Fiction", 7.99f);

		CompactDisc cd1 = new CompactDisc(5, "Greatest Hits", "Music", 15.99f, 50, "Various Artists", "Various",
				new ArrayList<>());

		// Thêm các đối tượng vào giỏ hàng
		System.out.println("Adding items to cart...");
		cart.addMedia(dvd1);
		cart.addMedia(dvd2);
		cart.addMedia(book1);
		cart.addMedia(cd1);

		// Hiển thị giỏ hàng
		System.out.println("\nItems in the cart:");
		cart.print();

		// Xóa một đối tượng
		System.out.println("\nRemoving 'Star Wars' from cart...");
		cart.removeMedia(dvd2);

		// Hiển thị lại giỏ hàng sau khi xóa
		System.out.println("\nItems in the cart after removal:");
		cart.print();
		System.out.println("Danh sách trước khi sắp xếp:");
		cart.print();

		// Sắp xếp theo tiêu đề và in ra
		cart.sortByTitleCost();
		System.out.println("Danh sách sau khi sắp xếp theo tiêu đề và giá:");
		cart.print();

		// Sắp xếp theo giá và in ra
		cart.sortByCostTitle();
		System.out.println("Danh sách sau khi sắp xếp theo giá và tiêu đề:");
		cart.print();
	}
}
