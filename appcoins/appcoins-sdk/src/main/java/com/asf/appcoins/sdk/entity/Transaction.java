package com.asf.appcoins.sdk.entity;

/**
 * Created by neuro on 26-02-2018.
 */
public final class Transaction {

  private final String hash;
  private final String from;
  private final String to;
  private final String value;
  private final Status status;
  private final String contractAddress;

  public Transaction(String hash, String from, String to, String value, Status status,
      String contractAddress) {
    this.hash = hash;
    this.from = from;
    this.to = to;
    this.value = value;
    this.status = status;
    this.contractAddress = contractAddress;
  }

  public String getHash() {
    return hash;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public String getValue() {
    return value;
  }

  public Status getStatus() {
    return status;
  }

  public String getContractAddress() {
    return contractAddress;
  }

  public enum Status {
    PENDING(-1), ACCEPTED(1), FAILED(0),;

    private final String value;

    Status(int value) {
      this.value = Integer.toString(value);
    }

    Status(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }
  }
}
