package hust.soict.dsai.aims.cart.Cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {

	public static final int MAX_NUMBERS_ORDMedia = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsOrdered.size() < 20) {
			itemsOrdered.add(media);
			System.out.println("add media success");
		} else {
			System.out.println("the cart is full");
		}
	}

	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("remove media success");
		} else {
			System.out.println("the media does not exist");
		}
	}

	public float totalcost() {
		int sum = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}// tinh tong tien trong gio hang

	public void listMedia() {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i).toString());// in ra danh sach san pham co trong don hang
		}
	}

	public void print() {
		System.out.println("***********************CART************************\nOrdered Items:");
		if (this.itemsOrdered.size() == 0)
			System.out.println("No items in the cart");
		else {
			for (int i = 0; i < this.itemsOrdered.size(); i++) {
				System.out.println(itemsOrdered.get(i).toString());// in ra danh sach san pham co trong don hang
			}
		}
		System.out.println("***************************************************");
	}

	public void searchByid(int Id) {
		System.out.println("- The search by id " + Id + ":");
		boolean check = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getId() == Id) {
				check = true;
				System.out.println(this.itemsOrdered.get(i).toString());
				break;
			}
		}
		if (check == false)
			System.out.println("Disc not found");
	}

	public void searchByTitle(String Title) {
		System.out.println("- The search by title [" + Title + "]:");
		boolean check = false;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).equals(Title)) {
				check = true;
				System.out.println(this.itemsOrdered.get(i).toString());
				break;
			}
		}
		if (check == false)
			System.out.println("Disc not found");
	}

	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}

	public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}

	public void removeMedia(String title) {
		int check = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(title)) {
				this.removeMedia(itemsOrdered.get(i));
				check = 1;
			}

		}
		if (check == 0) {
			System.out.println("media not exist");
		}
	}

	public void checkplay(String title) {
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).equals(title)) {
				if (itemsOrdered.get(i) instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) itemsOrdered.get(i);
					cd.play();
				} else if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) itemsOrdered.get(i);
					dvd.play();
				}
			}
		}
	}

	public void cartclear() {
		itemsOrdered = null;
	}
}