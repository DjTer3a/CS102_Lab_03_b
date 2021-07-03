/**
 * Lab03 Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 02/07/2021
 */

public class TestIterators 
{
  public static void main( String[] args) 
  { 
        
    IntBag bag = new IntBag();
    
      bag.add(1);
      bag.add(2);
      bag.add(3);
      bag.add(4);
      bag.add(5);
      bag.add(6);
      bag.add(7);

    Iterator i, j;
    
    
    
    
    i = bag.iterator(1);

    int count =0;
    while ( i.hasNext() )
    {
            System.out.println( i.next() );
            j = bag.iterator(1);
            count++;
            while ( j.hasNext() )
            {
                    System.out.println( "--" + j.next() );
                   
                    
                    
            }
            System.out.println("The array has been iterated this many times: "+ count);
            
    } 
    System.out.println(bag.toString());
  }
}