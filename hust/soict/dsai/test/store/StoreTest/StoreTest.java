package hust.soict.dsai.test.store.StoreTest;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
		// Tạo một Store
		Store store = new Store();

		// Tạo một số đối tượng Media
		Book book1 = new Book(1, "Java Programming", "Education", 15.99f);
		Book book2 = new Book(2, "The Art of Computer Programming", "Education", 45.50f);

		DigitalVideoDisc dvd1 = new DigitalVideoDisc(3, "Avengers: Endgame", "Action", 19.99f, 180, "Anthony Russo");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(4, "Frozen II", "Animation", 12.50f, 120, "Jennifer Lee");

		ArrayList<Track> tracks = new ArrayList<>();
		tracks.add(new Track("Track 1", 300));
		tracks.add(new Track("Track 2", 240));
		CompactDisc cd1 = new CompactDisc(5, "Greatest Hits", "Music", 9.99f, 0, "Various Artists", "Artist Name",
				tracks);

		// Thêm các Media vào Store
		store.addMedia(book1);
		store.addMedia(book2);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(cd1);

		// Hiển thị danh sách Media trong Store
		System.out.println("Media in Store:");
		store.print();

		// Xóa một Media khỏi Store
		System.out.println("\nRemoving 'Frozen II' from Store...");
		store.removeMedia(dvd2);

		// Hiển thị lại danh sách Media
		System.out.println("\nMedia in Store after removal:");
		store.print();
	}
}