package factorymethod.ex1;

/* This class hides the object creation process from the client and supply the objects without specifying the exact class of object that will be created */
public class FirstFactory {
	/*
	 * This method improves the new operator by giving us the flexibility to
	 * create new objects by our own code
	 */
	public Connection createConnection(String type) {
		if (type.equals("Oracle")) {
			return new OracleConnection();
		} else if (type.equals("SQL Server")) {
			return new SqlServerConnection();
		} else {
			return new MySqlConnection();
		}
	}
}