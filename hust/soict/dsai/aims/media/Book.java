package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();

	public Book() {
		super();
	}

	public Book(int id, String title, String category, float cost, List<String> authors)

	{
		super(id, title, category, cost);
		this.authors = authors;
	}

	public Book(int id, String title, String category, float cost)

	{
		super(id, title, category, cost);

	}

	@Override
	public void setId(int Id) {
		super.setId(Id);
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public void setTitle(String Title) {
		super.setTitle(Title);
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public void setCategory(String category) {
		super.setCategory(category);
	}

	@Override
	public String getCategory() {
		return super.getCategory();
	}

	@Override
	public void setCost(float cost) {
		super.setCost(cost);
	}

	@Override
	public float getCost() {
		return super.getCost();
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) {
			System.out.println("this " + authorName + " is already exist");
		} else {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		} else {
			System.out.println("this" + authorName + "is not exist ");
		}

	}

	public String toString() {
		return "Id: " + this.getId() + " Title: " + this.getTitle() + " Category: " + this.getCategory() + " Cost: "
				+ this.getCost() + " authors:" + this.getAuthors();
	}
}
