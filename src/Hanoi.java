/**
* Towers Of Hanoi
* @author Fabian Kessler, Moritz Decker
*/
public class Hanoi
{
  Stick source_stick;
  Stick intermediate_stick;
  Stick dest_stick;

  public static void main(String[] args)
  {
    Hanoi hanoi = new Hanoi(10);
  }

  public Hanoi(int startAmountDisks) {
    source_stick = new Stick();
    intermediate_stick = new Stick();
    dest_stick = new Stick();
    
    for(int i = 0; i < startAmountDisks; i++) {
      source_stick.push(i);
    }
  }

  public void doHanoi() {
    //TODO implement
  }
}