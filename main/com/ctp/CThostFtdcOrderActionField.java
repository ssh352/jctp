/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    ctpJNI.CThostFtdcOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return ctpJNI.CThostFtdcOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    ctpJNI.CThostFtdcOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return ctpJNI.CThostFtdcOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpJNI.CThostFtdcOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpJNI.CThostFtdcOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpJNI.CThostFtdcOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpJNI.CThostFtdcOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    ctpJNI.CThostFtdcOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return ctpJNI.CThostFtdcOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpJNI.CThostFtdcOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpJNI.CThostFtdcOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    ctpJNI.CThostFtdcOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return ctpJNI.CThostFtdcOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    ctpJNI.CThostFtdcOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return ctpJNI.CThostFtdcOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    ctpJNI.CThostFtdcOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return ctpJNI.CThostFtdcOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    ctpJNI.CThostFtdcOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return ctpJNI.CThostFtdcOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    ctpJNI.CThostFtdcOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return ctpJNI.CThostFtdcOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpJNI.CThostFtdcOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpJNI.CThostFtdcOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    ctpJNI.CThostFtdcOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return ctpJNI.CThostFtdcOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpJNI.CThostFtdcOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpJNI.CThostFtdcOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpJNI.CThostFtdcOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpJNI.CThostFtdcOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpJNI.CThostFtdcOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpJNI.CThostFtdcOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CThostFtdcOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CThostFtdcOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CThostFtdcOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CThostFtdcOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcOrderActionField() {
    this(ctpJNI.new_CThostFtdcOrderActionField(), true);
  }

}