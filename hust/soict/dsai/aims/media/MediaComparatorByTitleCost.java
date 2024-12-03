package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Media m1, Media m2) {
		int titleComparison = m1.getTitle().compareTo(m2.getTitle());
		if (titleComparison != 0) {
			return titleComparison; // Sắp xếp theo tiêu đề
		}
		return Float.compare(m2.getCost(), m1.getCost()); // Sắp xếp giá giảm dần nếu tiêu đề giống nhau
	}
}