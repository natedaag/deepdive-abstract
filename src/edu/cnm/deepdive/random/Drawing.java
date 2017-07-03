/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.Random;

/**
 * @author natedaag
 *
 */
abstract class Drawing {
  
  private Random rng;
  
  /**
   * 
   */
  protected Drawing() {
    this(new Random());
  }
  
  /**
   * 
   * @param rng
   */
  protected Drawing(Random rng) {
    this.rng = rng;
  }

  /**
   * 
   * @return
   */
  protected Random getRng() {
    return rng;
  }

  /**
   * 
   * @param rng
   */
  protected void setRng(Random rng) {
    this.rng = rng;
  }
  
  /**
   * 
   */
  public abstract void shuffle();
  
  /**
   * 
   * @param num
   * @return
   */
  public abstract Integer[] draw(int num); 
  

}
