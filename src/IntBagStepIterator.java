
public class IntBagStepIterator extends IntBagIterator{
    

  //properties
    int m;
    IntBag bag2;
    int idx = 0;

    //constructor
    public IntBagStepIterator(int m, IntBag aBag){
        super(aBag);
        this.m=m;
        bag2 = aBag;
    }


    /**
     * method to check if there is next element in the array.
     *  @return boolean  
     */
    public boolean hasNext() 
    {
      if(idx < bag2.arraySize() ) 
      {
        return true;
      }
      else
        return false;
    }

    /**
     * method to check next element in the array.
     *  @return boolean  
     */
    public Integer next() {
      if(hasNext()){
        idx += m;
        return bag2.getIdx(idx-m);
      }
      else
        return null;
    }
    
  }
