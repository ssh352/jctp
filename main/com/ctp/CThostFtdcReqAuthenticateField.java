/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcReqAuthenticateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqAuthenticateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqAuthenticateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcReqAuthenticateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcReqAuthenticateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcReqAuthenticateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcReqAuthenticateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcReqAuthenticateField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    ctpJNI.CThostFtdcReqAuthenticateField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return ctpJNI.CThostFtdcReqAuthenticateField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthCode(String value) {
    ctpJNI.CThostFtdcReqAuthenticateField_AuthCode_set(swigCPtr, this, value);
  }

  public String getAuthCode() {
    return ctpJNI.CThostFtdcReqAuthenticateField_AuthCode_get(swigCPtr, this);
  }

  public CThostFtdcReqAuthenticateField() {
    this(ctpJNI.new_CThostFtdcReqAuthenticateField(), true);
  }

}