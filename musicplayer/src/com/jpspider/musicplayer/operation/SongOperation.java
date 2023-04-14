package com.jpspider.musicplayer.operation;
import java.util.*;

import com.jspiders.musicplayer.entity.Song;
public class SongOperation {
	Song s11 = new Song();
	static ArrayList<Song> al = new ArrayList<Song>();
	Scanner sc = new Scanner(System.in);

	public void playAllSongs() {
		System.out.println("*******Play All Songs***********");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

	public void playRandomSong() {
		int n = (int) (Math.random() * (al.size() - 1));
		System.out.println(al.get(n));
	}

	public void chooseSong() {
		System.out.println(al);
		viewAllSong();
		chooseSong();

	}

	public void addSong() {
		System.out.println("Enter Song sequence");
		int s1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Singer Name ");
		String s2 = sc.nextLine();

		System.out.println("Enter Song Name");
		String s3 = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Movie/Album");
		String s4 = sc.nextLine();
		sc.nextLine();

		System.out.println("Song Duration");
		double d1 = sc.nextDouble();

		s11.setPara(s1, s2, s3, s4, d1);

		al.add(s11);
	}

	public void removeSong() {
		System.out.println("Enter Song sequence to remove it");
		int num1 = sc.nextInt();
		al.remove(num1 - 1);
		System.out.println("Song remove Successfully");

	}

	public void editSong() {
		System.out.println("Enter song ID to edit the details");
		int choice3 = sc.nextInt();
		System.out.println("Enter ID");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Singer Name ");
		String n = sc.nextLine();

		System.out.println("Enter Song Name");
		String n1 = sc.nextLine();

		System.out.println("Enter Movie/Album");
		String n2 = sc.nextLine();

		System.out.println("Song Duration");
		double d2 = sc.nextDouble();

		al.get(choice3 - 1).setId(num);
		al.get(choice3 - 1).setName(n);
		al.get(choice3 - 1).setSong(n1);
		al.get(choice3 - 1).setAlbum(n2);
		al.get(choice3 - 1).setDuration(d2);
		System.out.println("Song Edited Successfully");

	}

	public static void viewAllSong() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}

