package pattern.behavioral.observer.ex1;

public class TestObserver {
	public static void main(String args[]) {
		Database database = new Database();
		Archiver archiver = new Archiver();
		Client client = new Client();
		Boss boss = new Boss();

		database.registerObserver(archiver);
		database.registerObserver(client);
		database.registerObserver(boss);
		database.editRecord("delete", "record 1");
	}
}