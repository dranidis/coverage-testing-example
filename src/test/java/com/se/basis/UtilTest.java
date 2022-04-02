package com.se.basis;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test
 */
public class UtilTest {

    /**
     * Statement coverage
     * 
     */

     /**
      * a  b  x     a > 1  b == 0  ( and ) x'<-x/2  a == 2   x' > 1  ( or )
      * 2  0  2        T      T       T       1       T        F       T
      */

     @Test
     public void method_path_CE_Test() {
         assertEquals(2, Util.method(2, 0, 2));
     }

    /**
     * Decision coverage
     * 
     */

     /**
      * a  b  x     a > 1  b == 0  ( and ) x'<-x/2  a == 2   x' > 1  ( or )
      *                            =======                           ======
      * 2  0  2        T      T       T       1       T        F       T
      * 0  0  1        F      T       F       1       F        F       F
      */

    //  @Test
    //  public void method_path_CE_Test() {
    //      assertEquals(2, Util.method(2, 0, 2));
    //  }

    //  @Test
    //  public void method_path_BD_Test() {
    //      assertEquals(1, Util.method(0, 0, 1));
    //  }

    /**
     * Condition coverage
     */

     /**
      * a  b  x     a > 1  b == 0  ( and ) x'<-x/2  a == 2   x' > 1  ( or )
      *             =====  ======                   ======   ====== 
      * 2  0  2        T      T       T       1       T        F       T
      * 1  1  1        F      F       F       1       F        F       T
      */
    // @Test
    // public void method_path_CE_Test() {
    //     assertEquals(2, Util.method(2, 0, 2));
    // }

    // @Test
    // public void method_path_BD_Test() {
    //     assertEquals(1, Util.method(1, 1, 1));
    // }

    /**
     * Modified Condition/Decision coverage
     */
     /**
      * a  b  x     a > 1  b == 0  ( and ) x'<-x/2  a == 2   x' > 1  ( or )
      *             =====  ======                   ======   ====== 
      * 2  0  2        T      T       T       1       T        F       T
      * 1  0  1        F      T       F       1       F        F       F
      * 3  1  2        T      F       F       2       F        T       T         
      */

    //   @Test
    //   public void method_path_CE_Test() {
    //       assertEquals(2, Util.method(2, 0, 2));
    //   }
  
    //   @Test
    //   public void method_path_BD_Test() {
    //       assertEquals(1, Util.method(1, 0, 1));
    //   }
  
    //   @Test
    //   public void method_path_BE_Test() {
    //       assertEquals(3, Util.method(3, 1, 2));
    //   }
  

  


    /**
     * For covering the class
     */
    @Test
    public void UtilObject() {
        new Util();
    }

}
