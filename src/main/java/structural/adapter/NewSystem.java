package structural.adapter;

public class NewSystem {
	
	static MediaPlayer player =  new MediaAdapter();
	public static void main(String[] args) {
		player.play("mp3", "gogogo.mp3");
		player.play("vlc", "cococo.vlc");
		player.play("mp4", "nonono.mp4");
	}	
}
