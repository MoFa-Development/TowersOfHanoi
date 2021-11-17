package hanoi;

import hanoi.visualization.CLIVisualization;
import hanoi.visualization.Visualization;

/**
 * Towers Of Hanoi
 * @author Fabian Kessler, Moritz Decker
 */
public class Hanoi
{
  protected Visualization vis;
  
  public Stick a;
  public Stick b;
  public Stick c;
  
  public int n;

  public static void main(String[] args)
  {
    new Hanoi(10);
  }

  public Hanoi(int n)
  {
    vis = new CLIVisualization(this);
    
    a = new Stick();
    b = new Stick();
    c = new Stick();

    this.n = n;

    for(int i = n; i > 0; i--) {
      a.push(i);
    }

    doHanoi(a, b, c, n);
  }

  public void doHanoi(Stick ursprung, Stick randy, Stick ziel, int n)
  {
    if(n>0)
    {
      doHanoi(randy, ursprung, ziel, n-1);
    }

    ursprung.moveTopDiskToStick(ziel);

    vis.draw();
  }
}