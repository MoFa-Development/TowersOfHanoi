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
  
  public final Stick A;
  public final Stick B;
  public final Stick C;
  
  public final int N;

  private int steps;

  public static void main(String[] args)
  {
    new Hanoi(10);
  }

  public Hanoi(int N)
  {
    vis = new CLIVisualization(this);
    
    A = new Stick();
    B = new Stick();
    C = new Stick();

    this.N = N;

    for(int i = N; i > 0; i--) {
      A.push(i);
    }

    doHanoi(A, B, C, N);

    System.out.print("Needed steps: ");
    System.out.println(this.steps);
  }

  public void doHanoi(Stick src, Stick randy, Stick dst, int n)
  {
    if(n > 1) {
      doHanoi(src, dst, randy, n-1);
    }

    src.moveTopTo(dst);
    this.steps++;
    vis.draw();

    if(n > 1) {
      doHanoi(randy, src, dst, n-1);
    }
  }
}