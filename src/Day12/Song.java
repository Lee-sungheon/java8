package Day12;

public class Song {

	String year, contry, singer, songName;
	
	Song(){
	}
	Song(String year, String contry, String singer, String songName){
		this.year = year;
		this.contry = contry;
		this.singer = singer;
		this.songName = songName;
	}
	
	void show() {
		
		System.out.println(year + "년 " + contry + "국적의 " + singer + "가 부른 " + songName);
		return;
	}
}
