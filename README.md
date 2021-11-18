# TowersOfHanoi

> The Tower of Hanoi (also called The problem of Benares Temple or Tower of Brahma or Lucas' Tower and sometimes pluralized as Towers, or simply pyramid puzzle) is a mathematical game or puzzle consisting of three rods and a number of disks of various diameters, which can slide onto any rod. The puzzle begins with the disks stacked on one rod in order of decreasing size, the smallest at the top, thus approximating a conical shape. The objective of the puzzle is to move the entire stack to the last rod, obeying the following rules:
>
>    * Only one disk may be moved at a time.
>    * Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
>    * No disk may be placed on top of a disk that is smaller than it.
> 
> With 3 disks, the puzzle can be solved in 7 moves. The minimal number of moves required to solve a Tower of Hanoi puzzle is 2<sup>n</sup> − 1, where n is the number of disks. 
> 
> — <cite>[Wikipedia](https://en.wikipedia.org/wiki/Tower_of_Hanoi)</cite>

## Our recursive solution
```java
  public void doHanoi(Stick src, Stick randy, Stick dst, int n)
  {
    if(n > 1) {
      doHanoi(src, dst, randy, n-1);
    }

    src.moveTopTo(dst);

    if(n > 1) {
      doHanoi(randy, src, dst, n-1);
    }
  }
```

## Output for N=4
```
    =#=          #           #    
   ==#==         #           #    
  ===#===        #           #    
 ====#====       #           #    



     #           #           #    
   ==#==         #           #    
  ===#===        #           #    
 ====#====      =#=          #    



     #           #           #    
     #           #           #    
  ===#===        #           #    
 ====#====      =#=        ==#==  



     #           #           #    
     #           #           #    
  ===#===        #          =#=   
 ====#====       #         ==#==  



     #           #           #    
     #           #           #    
     #           #          =#=   
 ====#====    ===#===      ==#==  



     #           #           #    
     #           #           #    
    =#=          #           #    
 ====#====    ===#===      ==#==  



     #           #           #    
     #           #           #    
    =#=        ==#==         #    
 ====#====    ===#===        #    



     #           #           #    
     #          =#=          #    
     #         ==#==         #    
 ====#====    ===#===        #    



     #           #           #    
     #          =#=          #    
     #         ==#==         #    
     #        ===#===    ====#====



     #           #           #    
     #           #           #    
     #         ==#==        =#=   
     #        ===#===    ====#====



     #           #           #    
     #           #           #    
     #           #          =#=   
   ==#==      ===#===    ====#====



     #           #           #    
     #           #           #    
    =#=          #           #    
   ==#==      ===#===    ====#====



     #           #           #    
     #           #           #    
    =#=          #        ===#=== 
   ==#==         #       ====#====



     #           #           #    
     #           #           #    
     #           #        ===#=== 
   ==#==        =#=      ====#====



     #           #           #    
     #           #         ==#==  
     #           #        ===#=== 
     #          =#=      ====#====



     #           #          =#=   
     #           #         ==#==  
     #           #        ===#=== 
     #           #       ====#====
     
Needed steps: 15
```
