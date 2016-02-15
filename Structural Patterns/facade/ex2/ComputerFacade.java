package facade.ex2;
/* Facade in this example wrap a poorly designed collection of APIs with a single well-designed API..
 * Facade also helps in making coupling loose between two objects */
public class ComputerFacade { 
	private static final long BOOT_ADDRESS = 9999;
	private static final long BOOT_SECTOR = 1;
	private static final int SECTOR_SIZE = 512;
	private Memory ram;
	private Harddrive hd;
	private CPU processor;

	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new Harddrive();
	}

	public void start() {
		processor.freeze();
		ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
	}
}
