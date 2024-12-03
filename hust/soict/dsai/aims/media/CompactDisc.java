package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {

			System.out.println("track is already exist");
		} else {
			tracks.add(track);
		}
	}

	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println(" remove success");
		} else {
			System.out.println("track does not exist");
		}
	}

	public int getLength() {
		int length = 0;
		for (int i = 0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}

	@Override
	public String toString() {
		return "CompactDisc [artist=" + artist + ", tracks=" + tracks + ", length=" + getLength() + "]";
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());

		System.out.println("DVD length: " + this.getLength());
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println("Playing Track " + i + ":" + tracks.get(i).getTitle());

			System.out.println("Track " + i + " length: " + tracks.get(i).getLength());
		}
	}
}
