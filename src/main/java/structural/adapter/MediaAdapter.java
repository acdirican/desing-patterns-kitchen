package structural.adapter;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer player = new AdvancedAudioPlayer();

	@Override
	public void play(String audioType, String fileName) {
		// inbuilt support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) {
			player.playMp3(fileName);
		}
		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc")) {
			player.playVlc(fileName);

		} else if (audioType.equalsIgnoreCase("mp4")) {
			player.playMp4(fileName);
		} else {

		}

	}

}
