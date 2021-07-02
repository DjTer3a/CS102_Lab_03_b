
public class IntBagStepIterator extends IntBagIterator{
    
    int m;
    IntBag bag2;
    int idx = 0;

    public IntBagStepIterator(int m, IntBag aBag){
        super(aBag);
        this.m=m;
        bag2 = aBag;
    }
    public boolean hasNext() 
    {
      if(idx < bag2.arraySize() ) 
      {
        return true;
      }
      else
        return false;
    }

    //next method
    public Integer next() {
      if(hasNext()){
        idx += m;
        return bag2.getIdx(idx-m);
      }
      else
        return null;
    }
    
  }
