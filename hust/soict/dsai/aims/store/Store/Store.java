package hust.soict.dsai.aims.store.Store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("[" + media.getTitle() + "] already exists in the store");
		} else {
			itemsInStore.add(media);
			System.out.println("[" + media.getTitle() + "] has been added to the store");
		}
	}

	public void removeMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			System.out.println("[" + media.getTitle() + "] doesn't exists in the store");
		} else {
			itemsInStore.remove(media);
			System.out.println("[" + media.getTitle() + "] has been deleted from the store");
		}
	}

	public void print() {
		System.out.println("***********************CART************************\nOrdered Items:");
		if (this.itemsInStore.size() == 0)
			System.out.println("No items in the store");
		else {
			for (int i = 0; i < this.itemsInStore.size(); i++) {
				System.out.println(itemsInStore.get(i).toString());// in ra danh sach san pham co trong don hang
			}
		}
		System.out.println("***************************************************");
	}

	public void SearchbyTitle(String title) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(title)) {
				itemsInStore.get(i).toString();

			}
		}
	}

	public void checkplay(String title) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(title)) {
				if (itemsInStore.get(i) instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) itemsInStore.get(i);
					cd.play();
				} else if (itemsInStore.get(i) instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) itemsInStore.get(i);
					dvd.play();
				}
			}
		}

	}

	public void removeMediaByTitle(String title) {

		for (int i = 0; i < itemsInStore.size(); i++) {

			if (itemsInStore.get(i).getTitle().equals(title)) {

				itemsInStore.remove(i);
				System.out.println("Media with title '" + title + "' has been removed.");
				return;
			}
		}

		System.out.println("No media with title '" + title + "' found.");
	}

}
