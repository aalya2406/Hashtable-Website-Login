package structures;

public class LinearCollisionHandler <K> implements CollisionHandler <K>{
    private int probeLength;

    /**
  * Constructors to set probeLength to 1, or a different length.
  */
    public LinearCollisionHandler(){
        this.probeLength = 1;
    }

    public LinearCollisionHandler(int probeLength){
        this.probeLength = probeLength;
    }

/**
  * Method starts at index and searches linearly until an open spot
  * is found in the array. This could include index itself.
  * index = (index + probeLength) % size
  */
   public int probe(int index, boolean[] activeArray, int M) {
      //TODO: Implement this method.
      int a;
      for(a =0;a< M;a++){
        if(!activeArray[(a+index%M)]){
          return (a+ index) % M;
        }
      }
      return -1; 
      
      
    }

    

  /**
* Start at index and search the array linearly until the target
* is found. Then return the array index of the target. 
* Return -1 if not found.
*/
   public int search(int startIndex, K target, K[] keyArray, boolean [] activeArray, int M){
      //TODO: Implement this method.
      int b;
      for (b = 0; b < M; b++){

        if (keyArray[startIndex] == null){
          return -1;
        }
        
        if (activeArray[startIndex] == false){
          startIndex = (startIndex+probeLength)%M;
        }
        else if (keyArray[startIndex].equals(target)){
          return startIndex;
        }
        else{
        startIndex = (startIndex+probeLength)%M;
        }
      }
    return -1;

}
}
