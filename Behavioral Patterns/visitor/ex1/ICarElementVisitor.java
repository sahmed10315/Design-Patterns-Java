package visitor.ex1;

/* By implementing this interface we can add new operations to existing object structures without modifying those structures */
public interface ICarElementVisitor {
	void visit(Wheel wheel);

	void visit(Engine engine);

	void visit(Body body);

	void visit(Car car);
}
