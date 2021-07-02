
public class IntBagStepIterator extends IntBagIterator{
    
    int n;
    IntBag bag2;
    int idx = 0;

    public IntBagStepIterator(int n, IntBag aBag){
        super(aBag);
        this.n=n;
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
        idx += n;
        return bag2.getIdx(idx-n);
      }
      else
        return null;
    }
    
  }
