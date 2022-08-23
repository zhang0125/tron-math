package org.tron.math;

import org.junit.Assert;
import org.junit.Test;

public class TronMathTest {
  @Test
  public void testLoad() {
    TronMath.loadLib();
    double x=1.0061363892207218, y=0.0005;
    Assert.assertTrue(Double.compare(1.0000030588238054,TronMath.power(x,y))==0);
  }
}
