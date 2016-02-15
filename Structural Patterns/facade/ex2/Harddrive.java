package facade.ex2;

public class Harddrive {
	public byte[] read(long lba, int size) {
		System.out.println("Harddrive: Reading from " + lba + " of size: " + size);
		return new byte[] {1,1,1,1};
	}
}
