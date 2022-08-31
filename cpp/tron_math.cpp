#include <jni.h>        // JNI header provided by JDK
#include <stdio.h>      // C Standard IO Header
#include "tron_math.h"   // Generated
 
JNIEXPORT jdouble JNICALL Java_org_tron_math_TronMath_pow(JNIEnv *env, jobject thisObj, jdouble a, jdouble b) {
   double r = 0;
  __asm__ __volatile__ (
        "fldl %[op2]    \n\t"
        "fldl %[op1]    \n\t"
        "fyl2x          \n\t"
        "f2xm1          \n\t"
        "fld1           \n\t"
        "faddp %%st(1), %%st(0) \n\t"
        "fstpl %[op3]   \n\t"
        : [op3]"=m"(r)
        : [op1]"m"(a), [op2]"m"(b)
  );
  return r;
}