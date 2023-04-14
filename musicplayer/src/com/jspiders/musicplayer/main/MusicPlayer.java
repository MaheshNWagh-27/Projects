package com.jspiders.musicplayer.main;

import java.util.*;

import com.jpspider.musicplayer.operation.SongOperation;
import com.jspiders.musicplayer.entity.*;

public class MusicPlayer {
	
	public static void main(String[] args) {

		musicPlayer();	

	
	}	
	public static void musicPlayer()
	{
		SongOperation song1 = new SongOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("********MENU*******");
		System.out.println("1.Play Songs");
		System.out.println("2.Add/Remove Song");
		System.out.println("3.Edit Song");
		System.out.println("4.Exit");
		
		boolean flag=true;
		
		while(flag==true) {
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("*****Play Song******");
				System.out.println("1.Play All Sonngs");
				System.out.println("2.Play Random Song");
				System.out.println("3.Choose to play");
				System.out.println("4.Go Back");
				
				int choice1=sc.nextInt();
				switch(choice1) 
				{
				case 1:song1.playAllSongs();
				musicPlayer();
				break;
				
				case 2:song1.playRandomSong();
				musicPlayer();
				break;
				
				case 3:song1.chooseSong();
				{
					int c1=sc.nextInt();
					switch(c1)
					{
					case 1:SongOperation.viewAllSong();
					}
				}
				musicPlayer();
				break;
				
				case 4:musicPlayer();
				break;
				}
			}
			break;
			
			case 2:{
				System.out.println("******Add/Remove Song*******");
				System.out.println("1.Add Song");
				System.out.println("2.Remove Song");
				System.out.println("3.Go Back");
				
				int choice2=sc.nextInt();
				switch(choice2)
				{
				case 1:song1.addSong();
				musicPlayer();
				break;
				
				case 2:song1.removeSong();
				musicPlayer();
				break;
				
				case 3: musicPlayer();
				break;
				}
			}
			break;
			
			case 3:{
				System.out.println("*********Edit Song***********");
				System.out.println("Select Song to edit");
				int choice3=sc.nextInt();
				switch(choice3)
				{
				case 1:song1.editSong();
				musicPlayer();
				break;
				
				case 2:musicPlayer();
				break;
				
				}
				
			}
			break;
			
			case 4:{
				System.out.println("******THANK YOU******");
			}
			break;
			
				default :System.out.println("Invalid input please enter valid number");
				musicPlayer();
			 
			}
			
			flag = false;
		}
		
		
	}
}
