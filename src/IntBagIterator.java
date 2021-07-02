import java.util.*;

public class IntBagIterator implements Iterator{


    //properties
    IntBag aBag;
    int idx;
    int num;



    //constructor
    public IntBagIterator(IntBag aBag){
        this.aBag =aBag;
        idx=0;
    }

    /**
     * method to check if there is next element in the array.
     *  @return boolean  
     */
    public boolean hasNext(){
        if(idx < aBag.arraySize()-1){
            return true;
        }
        else{
            return false;
        }
    }


    /**
     * method to remove element in the array.
     *  @return void  
     */
    public void delete(){
        aBag.remove(idx);
    }
 

    /**
     * method to check next element in the array.
     *  @return boolean  
     */
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
