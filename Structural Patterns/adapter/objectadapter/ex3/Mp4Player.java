package adapter.objectadapter.ex3;

public class Mp4Player implements AdvancedMediaPlayer {
 
	@Override
	public void play(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}