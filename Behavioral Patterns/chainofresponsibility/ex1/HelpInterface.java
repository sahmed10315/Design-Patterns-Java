package chainofresponsibility.ex1;

/* To create a chain of objects, all objects which will be a part of chain implement this interface */
public interface HelpInterface {
	public void getHelp(int helpConstant);
}