package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class Aims {
	public static void showMenu() {

		System.out.println("AIMS: ");

		System.out.println("--------------------------------");

		System.out.println("1. View store");

		System.out.println("2. Update store");

		System.out.println("3. See current cart");

		System.out.println("0. Exit");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3");

	}

	public static void storeMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. See a media’s details");

		System.out.println("2. Add a media to cart");

		System.out.println("3. Play a media");

		System.out.println("4. See current cart");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4");

	}

	public static void mediaDetailsMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Add to cart");

		System.out.println("2. Play");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2");

	}

	public static void cartMenu() {

		System.out.println("Options: ");

		System.out.println("--------------------------------");

		System.out.println("1. Filter medias in cart");

		System.out.println("2. Sort medias in cart");

		System.out.println("3. Remove media from cart");

		System.out.println("4. Play a media");

		System.out.println("5. Place order");

		System.out.println("0. Back");

		System.out.println("--------------------------------");

		System.out.println("Please choose a number: 0-1-2-3-4-5");

	}

	public static void viewStore(Store store, Cart cart, Scanner scanner) {
		System.out.println("Store items:");
		store.print();

		while (true) {
			storeMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				String S = scanner.nextLine();
				store.SearchbyTitle(S);
				break;
			case 2:
				System.out.println("1. Book");
				System.out.println("2. CD");
				System.out.println("0. DVD");
				int id = scanner.nextInt();
				scanner.nextLine();
				String title = scanner.nextLine();
				String category = scanner.nextLine();
				float cost = scanner.nextFloat();
				int lc = scanner.nextInt();
				scanner.nextLine();
				if (lc == 1) {
					Book book = new Book(id, title, category, cost);
					store.addMedia(book);
				} else if (lc == 2) {
					CompactDisc CD = new CompactDisc(id, title, category, cost);
					store.addMedia(CD);
				} else {
					DigitalVideoDisc DVD = new DigitalVideoDisc(id, title, category, cost);
					store.addMedia(DVD);
				}

				break;
			case 3:
				System.out.println("Nhap title Media muon play");
				String ten = scanner.nextLine();
				store.checkplay(ten);
				break;
			case 4:
				seeCart(cart, scanner);
				return;
			case 0:
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	public static void updateStore(Store store, Scanner scanner) {
		System.out.println("1. Add media");
		System.out.println("2. Remove media");
		System.out.println("0. Back");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter media details (id,title, category, cost):");
			int id = scanner.nextInt();
			scanner.nextLine();
			String title = scanner.nextLine();
			String category = scanner.nextLine();
			float cost = scanner.nextFloat();
			System.out.println("1. Book");
			System.out.println("2. CD");
			System.out.println("3. DVD");
			int lc = scanner.nextInt();
			scanner.nextLine();
			if (lc == 1) {
				Book book = new Book(id, title, category, cost);
				store.addMedia(book);
				break;
			} else if (lc == 2) {
				CompactDisc CD = new CompactDisc(id, title, category, cost);
				store.addMedia(CD);
				break;
			} else if (lc == 3) {
				DigitalVideoDisc DVD = new DigitalVideoDisc(id, title, category, cost);
				store.addMedia(DVD);
				break;
			} else {
				System.out.println("nhap sai ");
				break;
			}

		case 2:
			System.out.println("Enter media title to remove:");
			title = scanner.nextLine();
			store.removeMediaByTitle(title);
			break;
		case 0:
			return;
		default:
			System.out.println("Invalid choice.");
		}
	}

	public static void seeCart(Cart cart, Scanner scanner) {
		System.out.println("Current cart items:");
		cart.print();

		while (true) {
			cartMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Filter by (1: Title, 2: ID): ");
				int filterChoice = scanner.nextInt();
				scanner.nextLine();
				if (filterChoice == 1) {
					System.out.println("Enter title:");
					String title = scanner.nextLine();
					cart.searchByTitle(title);
				} else if (filterChoice == 2) {
					System.out.println("Enter ID:");
					int id = scanner.nextInt();
					cart.searchByid(id);
				} else {
					System.out.println("Invalid choice.");
				}
				break;
			case 2:
				System.out.println("Sort by (1: Title, 2: Cost): ");
				int sortChoice = scanner.nextInt();
				scanner.nextLine();
				if (sortChoice == 1) {
					cart.sortByTitleCost();
				} else if (sortChoice == 2) {
					cart.sortByCostTitle();
				} else {
					System.out.println("Invalid choice.");
				}
				break;
			case 3:
				System.out.println("Enter media title to remove:");
				String title = scanner.nextLine();
				cart.removeMedia(title);
				break;
			case 4:
				System.out.println("Enter media title to play:");
				title = scanner.nextLine();
				cart.checkplay(title);
				break;
			case 5:
				System.out.println("Order placed. Cart cleared.");
				cart.cartclear();
				return;
			case 0:
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng trống

			switch (choice) {
			case 1:
				viewStore(store, cart, scanner);
				break;
			case 2:
				updateStore(store, scanner);
				break;
			case 3:
				seeCart(cart, scanner);
				break;
			case 0:
				System.out.println("Exiting the program...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

}
