package hust.soict.dsai.aims.media;

public class Disc extends Media {
	private int length;
	private String director;

	public Disc() {
		// TODO Auto-generated constructor stub
	}

	public Disc(int Id, String Title, String Category, float cost, int length, String director) {
		super(Id, Title, Category, cost);
		this.length = length;
		this.director = director;
	}

	public Disc(int Id, String Title, String Category, float cost) {
		super(Id, Title, Category, cost);

	}

	public int getLength() {
		return this.length;
	}

	public String getDirector() {
		return this.director;
	}

	public void setLength(int Length) {
		this.length = Length;
	}

	public void setDirector(String Director) {
		this.director = Director;
	}

}
