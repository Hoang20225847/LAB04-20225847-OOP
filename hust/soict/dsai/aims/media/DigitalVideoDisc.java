package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	private int quantity;
	private static int nbDigitalVideoDiscs = 0; // class attribute
	// instance attribute

	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);

	}

	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);

	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setId(int Id) {
		super.setId(Id);
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public void setTitle(String Title) {
		super.setTitle(Title);
	}

	@Override
	public String getCategory() {
		return super.getCategory();
	}

	@Override
	public void setCategory(String category) {
		super.setCategory(category);
	}

	@Override
	public float getCost() {
		return super.getCost();
	}

	@Override
	public void setCost(float cost) {
		super.setCost(cost);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DigitalVideoDisc [title=" + this.getTitle() + ", category=" + this.getCategory() + ", director="
				+ this.getDirector() + ", length=" + this.getLength() + ", cost=" + this.getCost() + ", quantity="
				+ quantity + "]";
	}

	public boolean isMatch(String Title) {
		if (this.getTitle().equals(Title)) {
			return true;
		} else
			return false;
	}

	public boolean isMatch(int Id) {
		if (this.getId() == Id) {
			return true;
		} else
			return false;
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());

		System.out.println("DVD length: " + this.getLength());
	}

}
