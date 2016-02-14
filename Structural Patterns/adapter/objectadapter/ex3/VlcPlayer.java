package adapter.objectadapter.ex3;

public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void play(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}
 
}