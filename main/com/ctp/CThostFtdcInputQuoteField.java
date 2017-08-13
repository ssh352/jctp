/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcInputQuoteField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcInputQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcInputQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return ctpJNI.CThostFtdcInputQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return ctpJNI.CThostFtdcInputQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    ctpJNI.CThostFtdcInputQuoteField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return ctpJNI.CThostFtdcInputQuoteField_QuoteRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return ctpJNI.CThostFtdcInputQuoteField_UserID_get(swigCPtr, this);
  }

  public void setAskPrice(double value) {
    ctpJNI.CThostFtdcInputQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return ctpJNI.CThostFtdcInputQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    ctpJNI.CThostFtdcInputQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return ctpJNI.CThostFtdcInputQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    ctpJNI.CThostFtdcInputQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return ctpJNI.CThostFtdcInputQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    ctpJNI.CThostFtdcInputQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return ctpJNI.CThostFtdcInputQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcInputQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcInputQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcInputQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcInputQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    ctpJNI.CThostFtdcInputQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return ctpJNI.CThostFtdcInputQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    ctpJNI.CThostFtdcInputQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return ctpJNI.CThostFtdcInputQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    ctpJNI.CThostFtdcInputQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return ctpJNI.CThostFtdcInputQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    ctpJNI.CThostFtdcInputQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return ctpJNI.CThostFtdcInputQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setAskOrderRef(String value) {
    ctpJNI.CThostFtdcInputQuoteField_AskOrderRef_set(swigCPtr, this, value);
  }

  public String getAskOrderRef() {
    return ctpJNI.CThostFtdcInputQuoteField_AskOrderRef_get(swigCPtr, this);
  }

  public void setBidOrderRef(String value) {
    ctpJNI.CThostFtdcInputQuoteField_BidOrderRef_set(swigCPtr, this, value);
  }

  public String getBidOrderRef() {
    return ctpJNI.CThostFtdcInputQuoteField_BidOrderRef_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return ctpJNI.CThostFtdcInputQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcInputQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return ctpJNI.CThostFtdcInputQuoteField_InvestUnitID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcInputQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcInputQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    ctpJNI.CThostFtdcInputQuoteField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return ctpJNI.CThostFtdcInputQuoteField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    ctpJNI.CThostFtdcInputQuoteField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return ctpJNI.CThostFtdcInputQuoteField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputQuoteField() {
    this(ctpJNI.new_CThostFtdcInputQuoteField(), true);
  }

}