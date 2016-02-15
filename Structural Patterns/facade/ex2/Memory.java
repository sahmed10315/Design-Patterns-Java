package facade.ex2;

import java.util.Arrays;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Memory: Reading from position: " + position + " data: " + Arrays.toString(data));
	}
}
