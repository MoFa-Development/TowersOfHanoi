package hanoi;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Stick
 * @author Fabian Kessler, Moritz Decker
 */
public class Stick extends Stack<Integer>
{
    public Integer moveTopDiskToStick(Stick stick) throws EmptyStackException {
        if(this.empty()) {
            return 0;
        }

        return stick.push(this.pop());    
    }
}