/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcTradingCodeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingCodeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingCodeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcTradingCodeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcTradingCodeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcTradingCodeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcTradingCodeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcTradingCodeField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcTradingCodeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcTradingCodeField_ExchangeID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiJNI.CThostFtdcTradingCodeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiJNI.CThostFtdcTradingCodeField_ClientID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    ctpapiJNI.CThostFtdcTradingCodeField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return ctpapiJNI.CThostFtdcTradingCodeField_IsActive_get(swigCPtr, this);
  }

  public void setClientIDType(char value) {
    ctpapiJNI.CThostFtdcTradingCodeField_ClientIDType_set(swigCPtr, this, value);
  }

  public char getClientIDType() {
    return ctpapiJNI.CThostFtdcTradingCodeField_ClientIDType_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpapiJNI.CThostFtdcTradingCodeField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpapiJNI.CThostFtdcTradingCodeField_BranchID_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    ctpapiJNI.CThostFtdcTradingCodeField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return ctpapiJNI.CThostFtdcTradingCodeField_BizType_get(swigCPtr, this);
  }

  public CThostFtdcTradingCodeField() {
    this(ctpapiJNI.new_CThostFtdcTradingCodeField(), true);
  }

}
