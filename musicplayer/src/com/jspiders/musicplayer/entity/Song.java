package com.jspiders.musicplayer.entity;

public class Song {
	private int id;
	private String name;
	private String song;
	private String album;
	private double duration;

public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public String getName()
{
	return name;	
}
public void setName(String name)
{
	this.name=name;
}
public String getSong()
{
	return song;
}
public void setSong(String song)
{
	this.song=song;
}
public String getAlbum()
{
	return album;
}
public void setAlbum(String album)
{
	this.album=album;
}
public double getDuration()
{
	return duration;
}
public void setDuration(double duration)
{
	this.duration=duration;
}

public   void setPara(int id,String name,String song,String album,double duration)
{
	this.id=id;
	this.name=name;
    this.song=song;
	this.album=album;
	this.duration=duration;
}
Song(int id, String name, String song, String album, double duration)
{
	this.id=id;
	this.name=name;
	this.song=song;
	this.album=album;
	this.duration =duration;
}

@Override
public String toString()
{
	return "Id :" +id +" ,Name :"+name+",song :"+song+",album :"+album+",Duration :"+duration;
}
public Song() {
	
}
}


