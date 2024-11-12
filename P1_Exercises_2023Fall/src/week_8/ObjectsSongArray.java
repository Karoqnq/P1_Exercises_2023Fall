package week_8;

import week_9.Song;

public class ObjectsSongArray {

	public static void main(String[] args) {
		
		Song[] songArray = {
			new Song("Easy on Me", "Adele", 2021),
			new Song("Shivers", "Ed Sheeran", 2021),
			new Song("Holy Ghost Fire", "Larkin Poe", 2020)};
		
			System.out.println("=== List of songs ===");
			for(Song song : songArray) {
				System.out.println(song);
			}
		}
	}




