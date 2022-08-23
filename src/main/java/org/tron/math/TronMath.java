package org.tron.math;

import org.fusesource.hawtjni.runtime.Library;

public class TronMath {
  /**
   * Supply the power method of JDK8.
   * notice y must in [-1,1]
   */
  public static native double power(double x, double y);

  public static void loadLib() {
    Library LIBRARY = new Library("tron_math", TronMath.class);
    LIBRARY.load();
  }

  public static void main(String[] args){
    //System.loadLibrary("tron_math");
    TronMath.loadLib();
    double x=1.0061363892207218, y=0.0005;
    System.out.printf("%.16f\n", power(x,y));
  }
}
