package adapter.objectadapter.ex3;

/* Adapter convert the interface of a class into another interface clients expect 
 * Reference : Effective Java, Page 8 , 22, 95, 107 
 * In JDK they are recognizable by creational methods taking an instance of different abstract/interface 
 * 		   type and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)
 * 
 * JDK Examples:   java.util.Arrays#asList()
 *  	  		   java.io.InputStreamReader(InputStream) (returns a Reader)
 *        		   java.io.OutputStreamWriter(OutputStream) (returns a Writer) */
public class TestObjectAdapter {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
