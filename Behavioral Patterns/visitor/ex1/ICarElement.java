package visitor.ex1;

/* Interface to represent elements, which can be used by the visitor pattern */
public interface ICarElement {
	void accept(ICarElementVisitor visitor);
}