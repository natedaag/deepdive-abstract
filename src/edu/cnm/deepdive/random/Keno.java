/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author natedaag
 *
 */
public class Keno extends Drawing {
  
  public static final int DEFAULT_POOL_SIZE = 80;
  
  private ArrayList<Integer> pool;
  private boolean shuffled = false;
  private int position;
  
  /**
   * 
   */
  public Keno() {
    this(DEFAULT_POOL_SIZE);
  }
  
  public Keno(int poolSize) {
    this(new Random(), poolSize);
  }

  /**
   * @param rng
   */
  public Keno(Random rng, int poolSize) {
    super(rng);
    pool = new ArrayList<>(poolSize);
    for (int i = 1; i <= poolSize; i++) {
      pool.add(i);
    }

  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.random.Drawing#shuffle()
   */
  @Override
  public void shuffle() {
    Collections.shuffle(pool, getRng());
    shuffled = true;
    position = 0;
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.random.Drawing#draw(int)
   */
  @Override
  public Integer[] draw(int num) {
    Integer[] result = new Integer[num];
    for (int i = 0; i < num; i++) {
      result[i] = draw();
    }
    return result;
  }
  
  public Integer draw() {
    if (!shuffled) {
      shuffle();
    }
    return pool.get(position++);
  }

}














