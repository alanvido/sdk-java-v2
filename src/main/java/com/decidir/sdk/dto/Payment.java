package com.decidir.sdk.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Payment implements Serializable {

  private Long id = 0L;
  private String token;
  private String date;
  private String date_created;
  private String date_approved;
  private String date_last_updated;
  private User collector;
  private String operation_type;
  private User payer;
  private Boolean binary_mode;
  private Boolean live_mode;
  private String description;
  private Currency currency;
  private Long amount;
  private Status status;
  private CardError status_details;
  private int installments;
  private String site_transaction_id;
  private String bin;
  private Card card_brand;
  private String payment_type; //single / distributed% / distributed$
  private String merchant_id;
  private List<SubPayment> sub_payments;
  private FraudDetectionData fraud_detection;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDate_created() {
    return date_created;
  }

  public void setDate_created(String date_created) {
    this.date_created = date_created;
  }

  public String getDate_approved() {
    return date_approved;
  }

  public void setDate_approved(String date_approved) {
    this.date_approved = date_approved;
  }

  public String getDate_last_updated() {
    return date_last_updated;
  }

  public void setDate_last_updated(String date_last_updated) {
    this.date_last_updated = date_last_updated;
  }

  public User getCollector() {
    return collector;
  }

  public void setCollector(User collector) {
    this.collector = collector;
  }

  public String getOperation_type() {
    return operation_type;
  }

  public void setOperation_type(String operation_type) {
    this.operation_type = operation_type;
  }

  public User getPayer() {
    return payer;
  }

  public void setPayer(User payer) {
    this.payer = payer;
  }

  public Boolean getBinary_mode() {
    return binary_mode;
  }

  public void setBinary_mode(Boolean binary_mode) {
    this.binary_mode = binary_mode;
  }

  public Boolean getLive_mode() {
    return live_mode;
  }

  public void setLive_mode(Boolean live_mode) {
    this.live_mode = live_mode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public CardError getStatus_details() {
    return status_details;
  }

  public void setStatus_details(CardError status_details) {
    this.status_details = status_details;
  }

  public int getInstallments() {
    return installments;
  }

  public void setInstallments(int installments) {
    this.installments = installments;
  }

  public String getPayment_type() {
    return payment_type;
  }

  public void setPayment_type(String payment_type) {
    this.payment_type = payment_type;
  }

  public List<SubPayment> getSub_payments() {
    return sub_payments;
  }

  public void setSub_payments(List<SubPayment> sub_payments) {
    this.sub_payments = sub_payments;
  }

  public String getSite_transaction_id() {
    return site_transaction_id;
  }

  public void setSite_transaction_id(String site_transaction_id) {
    this.site_transaction_id = site_transaction_id;
  }

  public String getBin() {
    return bin;
  }

  public void setBin(String bin) {
    this.bin = bin;
  }

  public Card getCard_brand() {
    return card_brand;
  }

  public void setCard_brand(Card card_brand) {
    this.card_brand = card_brand;
  }

  public String getMerchant_id() {
    return merchant_id;
  }

  public void setMerchant_id(String merchant_id) {
    this.merchant_id = merchant_id;
  }

  public FraudDetectionData getFraud_detection() {
    return fraud_detection;
  }

  public void setFraud_detection(FraudDetectionData fraud_detection) {
    this.fraud_detection = fraud_detection;
  }
}
