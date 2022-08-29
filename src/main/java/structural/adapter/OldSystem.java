package structural.adapter;

public class OldSystem {
	
	static MediaPlayer player =  new AudioPlayer();
	public static void main(String[] args) {
		player.play("mp3", "gogogo.mp3");
		player.play("vlc", "cococo.vlc");
		player.play("mp4", "nonono.mp4");
	}	
}
