package factorymethod.ex1;

public class SqlServerConnection extends Connection
{
  public SqlServerConnection()
  {
  }

  public String description()
  {
    return "SQL Server";
  }
}