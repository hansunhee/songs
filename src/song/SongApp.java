package song;

public class SongApp {
	
	
	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
//		song.show(song);
		Song song1=new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		Song song2 = new Song( "러빙유", "씨스타" );
	    Song song3 = new Song( "여수 밤바다", "버스커 버스커" );
	    song.show(song1);
	    song.show(song2);
	    song.show(song3);
	}
	
}
