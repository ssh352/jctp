/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcQuoteActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQuoteActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpapiJNI.delete_CThostFtdcQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_InvestorID_get(swigCPtr, this);
  }

  public void setQuoteActionRef(int value) {
    ctpapiJNI.CThostFtdcQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
  }

  public int getQuoteActionRef() {
    return ctpapiJNI.CThostFtdcQuoteActionField_QuoteActionRef_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return ctpapiJNI.CThostFtdcQuoteActionField_QuoteRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpapiJNI.CThostFtdcQuoteActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    ctpapiJNI.CThostFtdcQuoteActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    ctpapiJNI.CThostFtdcQuoteActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_QuoteSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpapiJNI.CThostFtdcQuoteActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_InstallID_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpapiJNI.CThostFtdcQuoteActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    ctpapiJNI.CThostFtdcQuoteActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return ctpapiJNI.CThostFtdcQuoteActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return ctpapiJNI.CThostFtdcQuoteActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpapiJNI.CThostFtdcQuoteActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpapiJNI.CThostFtdcQuoteActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpapiJNI.CThostFtdcQuoteActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpapiJNI.CThostFtdcQuoteActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcQuoteActionField() {
    this(ctpapiJNI.new_CThostFtdcQuoteActionField(), true);
  }

}
