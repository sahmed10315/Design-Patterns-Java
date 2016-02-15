package adapter.classadapter;

import java.awt.*;
/* Adapter to wrap a AWT check box through inheritance 
 * and adapt the getState() of AWT to isSelected() of Swing*/
public class CheckboxAdapter extends Checkbox
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckboxAdapter(String n) 
    {
      super(n);
    }

    public boolean isSelected()
    {
      return getState();
    }
}