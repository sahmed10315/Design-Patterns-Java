package factorymethod.ex1;

public class FirstFactory {
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