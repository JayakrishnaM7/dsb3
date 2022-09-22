package com.ibm.org.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Internal Fund Transfer
 */
@ApiModel(description = "Internal Fund Transfer")


public class InitPaymentRequest   {
  @JsonProperty("PaymentOrderProcedure")
  private String paymentOrderProcedure;

  @JsonProperty("PaymentTransactionInitiatorReference")
  private String paymentTransactionInitiatorReference;

  @JsonProperty("PayerReference")
  private Object payerReference = null;

  @JsonProperty("PayerProductInstanceReference")
  private Object payerProductInstanceReference = null;

  @JsonProperty("PayeeReference")
  private Object payeeReference = null;

  @JsonProperty("PayeeBankReference")
  private Object payeeBankReference = null;

  @JsonProperty("PayeeProductInstanceReference")
  private Object payeeProductInstanceReference = null;

  @JsonProperty("PayerBankReference")
  private Object payerBankReference = null;

  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("DateType")
  private String dateType;

  @JsonProperty("PaymentMechanismType")
  private String paymentMechanismType;

  @JsonProperty("PaymentInstructions")
  private String paymentInstructions;

  @JsonProperty("InterestedParties")
  private String interestedParties;

  @JsonProperty("ProductType")
  private String productType;

  @JsonProperty("SettlementInstructions")
  private String settlementInstructions;

  public InitPaymentRequest paymentOrderProcedure(String paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(String paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
  }

  public InitPaymentRequest paymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
    return this;
  }

  /**
   * Get paymentTransactionInitiatorReference
   * @return paymentTransactionInitiatorReference
  */
  @ApiModelProperty(value = "")


  public String getPaymentTransactionInitiatorReference() {
    return paymentTransactionInitiatorReference;
  }

  public void setPaymentTransactionInitiatorReference(String paymentTransactionInitiatorReference) {
    this.paymentTransactionInitiatorReference = paymentTransactionInitiatorReference;
  }

  public InitPaymentRequest payerReference(Object payerReference) {
    this.payerReference = payerReference;
    return this;
  }

  /**
   * Get payerReference
   * @return payerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(Object payerReference) {
    this.payerReference = payerReference;
  }

  public InitPaymentRequest payerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
    return this;
  }

  /**
   * Get payerProductInstanceReference
   * @return payerProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(Object payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }

  public InitPaymentRequest payeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
    return this;
  }

  /**
   * Get payeeReference
   * @return payeeReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(Object payeeReference) {
    this.payeeReference = payeeReference;
  }

  public InitPaymentRequest payeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
    return this;
  }

  /**
   * Get payeeBankReference
   * @return payeeBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(Object payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }

  public InitPaymentRequest payeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
    return this;
  }

  /**
   * Get payeeProductInstanceReference
   * @return payeeProductInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(Object payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }

  public InitPaymentRequest payerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
    return this;
  }

  /**
   * Get payerBankReference
   * @return payerBankReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(Object payerBankReference) {
    this.payerBankReference = payerBankReference;
  }

  public InitPaymentRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @ApiModelProperty(value = "")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InitPaymentRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InitPaymentRequest dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  public InitPaymentRequest paymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
    return this;
  }

  /**
   * Get paymentMechanismType
   * @return paymentMechanismType
  */
  @ApiModelProperty(value = "")


  public String getPaymentMechanismType() {
    return paymentMechanismType;
  }

  public void setPaymentMechanismType(String paymentMechanismType) {
    this.paymentMechanismType = paymentMechanismType;
  }

  public InitPaymentRequest paymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * Get paymentInstructions
   * @return paymentInstructions
  */
  @ApiModelProperty(value = "")


  public String getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(String paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public InitPaymentRequest interestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
    return this;
  }

  /**
   * Get interestedParties
   * @return interestedParties
  */
  @ApiModelProperty(value = "")


  public String getInterestedParties() {
    return interestedParties;
  }

  public void setInterestedParties(String interestedParties) {
    this.interestedParties = interestedParties;
  }

  public InitPaymentRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public InitPaymentRequest settlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
    return this;
  }

  /**
   * Get settlementInstructions
   * @return settlementInstructions
  */
  @ApiModelProperty(value = "")


  public String getSettlementInstructions() {
    return settlementInstructions;
  }

  public void setSettlementInstructions(String settlementInstructions) {
    this.settlementInstructions = settlementInstructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitPaymentRequest initPaymentRequest = (InitPaymentRequest) o;
    return Objects.equals(this.paymentOrderProcedure, initPaymentRequest.paymentOrderProcedure) &&
        Objects.equals(this.paymentTransactionInitiatorReference, initPaymentRequest.paymentTransactionInitiatorReference) &&
        Objects.equals(this.payerReference, initPaymentRequest.payerReference) &&
        Objects.equals(this.payerProductInstanceReference, initPaymentRequest.payerProductInstanceReference) &&
        Objects.equals(this.payeeReference, initPaymentRequest.payeeReference) &&
        Objects.equals(this.payeeBankReference, initPaymentRequest.payeeBankReference) &&
        Objects.equals(this.payeeProductInstanceReference, initPaymentRequest.payeeProductInstanceReference) &&
        Objects.equals(this.payerBankReference, initPaymentRequest.payerBankReference) &&
        Objects.equals(this.amount, initPaymentRequest.amount) &&
        Objects.equals(this.currency, initPaymentRequest.currency) &&
        Objects.equals(this.dateType, initPaymentRequest.dateType) &&
        Objects.equals(this.paymentMechanismType, initPaymentRequest.paymentMechanismType) &&
        Objects.equals(this.paymentInstructions, initPaymentRequest.paymentInstructions) &&
        Objects.equals(this.interestedParties, initPaymentRequest.interestedParties) &&
        Objects.equals(this.productType, initPaymentRequest.productType) &&
        Objects.equals(this.settlementInstructions, initPaymentRequest.settlementInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure, paymentTransactionInitiatorReference, payerReference, payerProductInstanceReference, payeeReference, payeeBankReference, payeeProductInstanceReference, payerBankReference, amount, currency, dateType, paymentMechanismType, paymentInstructions, interestedParties, productType, settlementInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitPaymentRequest {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
    sb.append("    paymentTransactionInitiatorReference: ").append(toIndentedString(paymentTransactionInitiatorReference)).append("\n");
    sb.append("    payerReference: ").append(toIndentedString(payerReference)).append("\n");
    sb.append("    payerProductInstanceReference: ").append(toIndentedString(payerProductInstanceReference)).append("\n");
    sb.append("    payeeReference: ").append(toIndentedString(payeeReference)).append("\n");
    sb.append("    payeeBankReference: ").append(toIndentedString(payeeBankReference)).append("\n");
    sb.append("    payeeProductInstanceReference: ").append(toIndentedString(payeeProductInstanceReference)).append("\n");
    sb.append("    payerBankReference: ").append(toIndentedString(payerBankReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("    paymentMechanismType: ").append(toIndentedString(paymentMechanismType)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    interestedParties: ").append(toIndentedString(interestedParties)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    settlementInstructions: ").append(toIndentedString(settlementInstructions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

