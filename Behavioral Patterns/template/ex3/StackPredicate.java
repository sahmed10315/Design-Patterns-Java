package template.ex3;

/* StackPredicate is the implementation of the template pattern, 
 * that allows client to define exactly how the filtering works. 
 */
public interface StackPredicate {
	boolean isValid(int i);
}