/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcSyncingInstrumentTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentTradingRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcSyncingInstrumentTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setTradingRight(char value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_set(swigCPtr, this, value);
  }

  public char getTradingRight() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_TradingRight_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcSyncingInstrumentTradingRightField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentTradingRightField() {
    this(ctpapiJNI.new_CThostFtdcSyncingInstrumentTradingRightField(), true);
  }

}
