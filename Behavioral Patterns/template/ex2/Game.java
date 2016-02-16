package template.ex2;

/* This is the template class, defining the template method play(). 
 * Template step methods can be abstract if all subclasses must define its own implementation, 
 * or they can be generic for reuse in subclasses.
 * In this example they are abstract.
 */
public abstract class Game {
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	/*
	 * Template algorithm method made up of multiple steps, whose structure and
	 * order of steps will not be changed by subclasses.
	 */
	public final void play() {

		// initialize the game
		initialize();

		// start game
		startPlay();

		// end game
		endPlay();
	}
}
