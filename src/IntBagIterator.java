import java.util.*;

public class IntBagIterator implements Iterator{

    IntBag aBag;
    int idx;
    int num;


    public IntBagIterator(IntBag aBag){
        this.aBag =aBag;
        idx=0;
    }

    public boolean hasNext(){
        if(idx < aBag.arraySize()-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void delete(){
        aBag.remove(idx);
    }
 
    public Integer next(){
        if(hasNext()){

            idx++;
            return aBag.getIdx(idx-1);
        }
        else{
            return null;
        }
    }
}
