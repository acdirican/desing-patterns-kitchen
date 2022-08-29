package structural.adapter;

public class AdvancedAudioPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

		System.out.println("Playing vcl file. Name: " + fileName);

	}

	@Override
	public void playMp4(String fileName) {

		System.out.println("Playing mp4 file. Name: " + fileName);

	}

	@Override
	public void playMp3(String fileName) {

		System.out.println("Playing mp3 file. Name: " + fileName);

	}

}
