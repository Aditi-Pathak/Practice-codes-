package scjp;

import java.util.ArrayList;

public class DVDInfo implements Comparable<DVDInfo>
{
	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t,String g,String l) 
	{
		title=t;
		genre=g;
		leadActor=l;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getLeadActor() {
		return leadActor;
	}


	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}


	public String toString()
	{

		return title + " " + genre + " " + leadActor +"\n";
	}
	
	

	public int compareTo(DVDInfo d)
	{
		return title.compareTo(d.getTitle());
	}

	public static void main(String[] args)
	{

		ArrayList<DVDInfo> dList= new ArrayList<DVDInfo>();

		DVDInfo d1=new DVDInfo("Donnie Darko","sci-fi","Gylenhall");
		DVDInfo d2=new DVDInfo("Raiders of the Lost Ark","action","Ford,Harrison");
		DVDInfo d3=new DVDInfo("2001","sci-fi","??");
		DVDInfo d4=new DVDInfo("Caddy Shack","comedy","Murray,Bill");
		DVDInfo d5=new DVDInfo("Star Wars","sci-fi","Ford,Harrison");
		DVDInfo d6=new DVDInfo("Lost in Translation","comedy","Murray,Bill");
		DVDInfo d7=new DVDInfo("Patriot Games","action","Ford,Harrison");
		
		dList.add(d1);
		dList.add(d2);
		dList.add(d3);
		dList.add(d4);
		dList.add(d5);
		dList.add(d6);
		dList.add(d7);
		System.out.println("unsorted "+dList);
		System.out.println("sorted "+dList);
	}
}




