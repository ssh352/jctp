/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcLimitPosiField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcLimitPosiField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLimitPosiField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcLimitPosiField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcLimitPosiField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcLimitPosiField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcLimitPosiField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcLimitPosiField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcLimitPosiField_ExchangeID_get(swigCPtr, this);
  }

  public void setTotalVolume(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_TotalVolume_set(swigCPtr, this, value);
  }

  public int getTotalVolume() {
    return ctpapiJNI.CThostFtdcLimitPosiField_TotalVolume_get(swigCPtr, this);
  }

  public void setLongVolume(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_LongVolume_set(swigCPtr, this, value);
  }

  public int getLongVolume() {
    return ctpapiJNI.CThostFtdcLimitPosiField_LongVolume_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return ctpapiJNI.CThostFtdcLimitPosiField_OpenVolume_get(swigCPtr, this);
  }

  public void setLongAmount(double value) {
    ctpapiJNI.CThostFtdcLimitPosiField_LongAmount_set(swigCPtr, this, value);
  }

  public double getLongAmount() {
    return ctpapiJNI.CThostFtdcLimitPosiField_LongAmount_get(swigCPtr, this);
  }

  public void setTotalVolumeFrozen(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_TotalVolumeFrozen_set(swigCPtr, this, value);
  }

  public int getTotalVolumeFrozen() {
    return ctpapiJNI.CThostFtdcLimitPosiField_TotalVolumeFrozen_get(swigCPtr, this);
  }

  public void setLongVolumeFrozen(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_LongVolumeFrozen_set(swigCPtr, this, value);
  }

  public int getLongVolumeFrozen() {
    return ctpapiJNI.CThostFtdcLimitPosiField_LongVolumeFrozen_get(swigCPtr, this);
  }

  public void setOpenVolumeFrozen(int value) {
    ctpapiJNI.CThostFtdcLimitPosiField_OpenVolumeFrozen_set(swigCPtr, this, value);
  }

  public int getOpenVolumeFrozen() {
    return ctpapiJNI.CThostFtdcLimitPosiField_OpenVolumeFrozen_get(swigCPtr, this);
  }

  public void setLongAmountFrozen(double value) {
    ctpapiJNI.CThostFtdcLimitPosiField_LongAmountFrozen_set(swigCPtr, this, value);
  }

  public double getLongAmountFrozen() {
    return ctpapiJNI.CThostFtdcLimitPosiField_LongAmountFrozen_get(swigCPtr, this);
  }

  public CThostFtdcLimitPosiField() {
    this(ctpapiJNI.new_CThostFtdcLimitPosiField(), true);
  }

}
