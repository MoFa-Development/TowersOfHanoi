package hanoi;

import hanoi.visualization.CLIVisualization;
import hanoi.visualization.Visualization;

/**
 * Towers Of Hanoi
 * @author Fabian Kessler, Moritz Decker
 */
public class Hanoi
{
  protected Stick source;
  protected Stick intermediate;
  protected Stick destination;
  protected int amountDisks;

  private Visualization vis;


  public int getAmountDisks()
  {
    return amountDisks;
  }

  public Stick getSource()
  {
    return source;
  }

  public Stick getIntermediate()
  {
    return intermediate;
  }

  public Stick getDestination()
  {
    return destination;
  }

  public static void main(String[] args)
  {
    new Hanoi(10);
  }

  public Hanoi(int startAmountDisks)
  {
    amountDisks = startAmountDisks;
    
    vis = new CLIVisualization(this);
    
    source = new Stick();
    intermediate = new Stick();
    destination = new Stick();
    
    for(int i = startAmountDisks; i > 0; i--) {
      source.push(i);
    }

    doHanoi();
  }

  public void doHanoi() {
    vis.draw();
  }
}