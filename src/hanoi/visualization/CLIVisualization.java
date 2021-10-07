package hanoi.visualization;

import hanoi.Hanoi;

/**
 * CLIVisualisation
 * @author Moritz Decker
 */
public class CLIVisualization extends Visualization
{        
    public CLIVisualization(Hanoi hanoi) {
        this.hanoi = hanoi;
    }

    private void repeatedPrint(int iterations, String str) {
        for(int i = 0; i < iterations; i++) {
            System.out.print(str);
        }
    }

    private void drawLayerOfStick(int i, Integer[] stickArr) {
        int r = 0;

        if(i < stickArr.length) {
            r = stickArr[i];
        }

        repeatedPrint(hanoi.getAmountDisks()-r, " ");

        repeatedPrint(r, "=");

        System.out.print("#");

        repeatedPrint(r, "=");

        repeatedPrint(hanoi.getAmountDisks()-r, " ");
    } 

    @Override
    public void draw()
    {   
        Integer[] source = hanoi.getSource().toArray(new Integer[0]);
        Integer[] intermediate = hanoi.getIntermediate().toArray(new Integer[0]);
        Integer[] destination = hanoi.getDestination().toArray(new Integer[0]);

        repeatedPrint(6*hanoi.getAmountDisks()+11, "-");
        System.out.print("\n\n");

        for(int i = hanoi.getAmountDisks()-1; i >= 0; i--) {
            System.out.print(" ");

            drawLayerOfStick(i, source);
            repeatedPrint(3, " ");
            drawLayerOfStick(i, intermediate);
            repeatedPrint(3, " ");
            drawLayerOfStick(i, destination);
            System.out.println("");
        }

        repeatedPrint(6*hanoi.getAmountDisks()+11, "-");
        System.out.println("");
    }
}