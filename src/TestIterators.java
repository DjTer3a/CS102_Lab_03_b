import java.util.*;
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


    while ( i.hasNext() )
    {
            System.out.println( i.next() );
            j = bag.iterator(1);
            while ( j.hasNext() )
            {
                    System.out.println( "--" + j.next() );
            }
    } 
  }
}