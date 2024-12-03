package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;

	public Track() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}

	public void play() {
		System.out.println("Playing Track: " + this.getTitle());

		System.out.println("Track length: " + this.getLength());
	}

	public boolean equals(Track track1, Track track2) {
		if ((track1.getTitle() == track2.getTitle()) && (track1.getLength() == track2.getLength()))
			return true;
		else
			return false;
	}
}
