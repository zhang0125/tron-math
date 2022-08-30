package org.tron.math;

import org.fusesource.hawtjni.runtime.Library;

public class TronMath {
  /**
   * Implement the pow method for JDK8 x86.
   * notice y must in [-1,1].
   * @param   a   the base.
   * @param   b   the exponent.
   * @return  the value {@code a}<sup>{@code b}</sup>.
   */
  public static native double pow(double a, double b);

  /**
   * Initialize dynamic libraries
   */
  public static void loadLib() {
    Library LIBRARY = new Library("tron_math", TronMath.class);
    LIBRARY.load();
  }
}
