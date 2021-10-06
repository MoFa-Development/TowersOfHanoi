import java.awt.Graphics;

import javax.swing.JFrame;
 
/**
 * Towers Of Hanoi
 * @author Fabian Kessler, Moritz Decker
 */
public class App extends JFrame
{
 
    public App()
    {
        super("Towers Of Hanoi");
 
        setSize(480, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    public void paint(Graphics g)
    {
        super.paint(g);

        //TODO draw graphics
    }
 
    public static void main(String[] args)
    {
        new App().setVisible(true);
    }
}