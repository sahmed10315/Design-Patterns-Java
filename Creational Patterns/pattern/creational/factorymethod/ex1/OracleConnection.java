package pattern.creational.factorymethod.ex1;

public class OracleConnection extends Connection
{
  public OracleConnection()
  {
  }

  public String description()
  {
    return "Oracle";
  }
}