/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcCurrentTimeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrentTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrentTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcCurrentTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrDate(String value) {
    ctpapiJNI.CThostFtdcCurrentTimeField_CurrDate_set(swigCPtr, this, value);
  }

  public String getCurrDate() {
    return ctpapiJNI.CThostFtdcCurrentTimeField_CurrDate_get(swigCPtr, this);
  }

  public void setCurrTime(String value) {
    ctpapiJNI.CThostFtdcCurrentTimeField_CurrTime_set(swigCPtr, this, value);
  }

  public String getCurrTime() {
    return ctpapiJNI.CThostFtdcCurrentTimeField_CurrTime_get(swigCPtr, this);
  }

  public void setCurrMillisec(int value) {
    ctpapiJNI.CThostFtdcCurrentTimeField_CurrMillisec_set(swigCPtr, this, value);
  }

  public int getCurrMillisec() {
    return ctpapiJNI.CThostFtdcCurrentTimeField_CurrMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    ctpapiJNI.CThostFtdcCurrentTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return ctpapiJNI.CThostFtdcCurrentTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcCurrentTimeField() {
    this(ctpapiJNI.new_CThostFtdcCurrentTimeField(), true);
  }

}
