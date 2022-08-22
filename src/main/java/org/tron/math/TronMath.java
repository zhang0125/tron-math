package org.tron.math;

import com.sun.jna.Native;

public class TronMath {
  /**
   * Supply the power method of JDK8.
   * notice y must in [-1,1]
   */
  public static native double power(double x, double y);

  private static boolean LoadLib() {
    try {
      Native.register(TronMath.class, "tron_math");
    } catch (final Throwable t) {
      return false;
    }
    return true;
  }
  // public static void main(String[] args){
  //   System.loadLibrary("tron_math");
  //   double x=1.0061363892207218, y=0.0005;
  //   System.out.printf("%.16f\n", power(x,y));
  // }
}
