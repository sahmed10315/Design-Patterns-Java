package adapter.classadapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.WindowConstants;

/* Class Adapter are designed to use multiple inheritance to merge the adapted class and the class 
 * we are trying to adapt to, in one class.
 * (True Class adapter pattern is not possible in java because of multiple inheritance not supported, This example 
 * is as close as we can get to creating class adapters in Java). 
 * 
 * Reference : Effective Java, Page 8, 22, 95, 107 */
public class TestClassAdapter {
    public static void main(String args[]) 
    {
        final Checkboxes f = new Checkboxes();

        f.setBounds(100, 100, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
