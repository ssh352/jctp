/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcSecAgentACIDMapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSecAgentACIDMapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSecAgentACIDMapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcSecAgentACIDMapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcSecAgentACIDMapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcSecAgentACIDMapField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcSecAgentACIDMapField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcSecAgentACIDMapField_UserID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpapiJNI.CThostFtdcSecAgentACIDMapField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpapiJNI.CThostFtdcSecAgentACIDMapField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpapiJNI.CThostFtdcSecAgentACIDMapField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpapiJNI.CThostFtdcSecAgentACIDMapField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    ctpapiJNI.CThostFtdcSecAgentACIDMapField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return ctpapiJNI.CThostFtdcSecAgentACIDMapField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public CThostFtdcSecAgentACIDMapField() {
    this(ctpapiJNI.new_CThostFtdcSecAgentACIDMapField(), true);
  }

}
