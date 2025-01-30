package com.shorewise.wiseconnect.lc;

import java.util.List;

public class LCRequest {

    private String dateAndPlaceOfExpiry;
    private String applicableRules;
    private String applicantName;
    private String applicantAddress;
    private String beneficiaryName;
    private String beneficiaryAddress;
    private String currency;
    private double amount;
    private String creditAmountTolerance;
    private String creditAvailableWith;
    private String creditAvailableBy;
    private String draftsAt;
    private String deferredPaymentDetails;
    private String mixedPaymentDetails;
    private String draftsDrawnOn;
    private boolean partialShipments;
    private boolean transshipments;
    private String placeOfTakingInCharge;
    private String portOfLoading;
    private String portOfDischarge;
    private String finalDestination;
    private String latestShipmentDate;
    private String modeOfShipment;
    private String goodsDescription;
    private String contractTerms;
    private String hsCode;
    private List<String> documentsRequired;
    private String applicantBankCharges;
    private String beneficiaryBankCharges;
    private String presentationPeriod;
    private String confirmationInstructions;
    private String confirmationCharges;
    private String adviseThroughBankName;
    private String adviseThroughBankAddress;
    private String adviseThroughBankIfscCode;
    private String instructionsToBank;

    // Getters and Setters
    public String getDateAndPlaceOfExpiry() { return dateAndPlaceOfExpiry; }
    public void setDateAndPlaceOfExpiry(String dateAndPlaceOfExpiry) { this.dateAndPlaceOfExpiry = dateAndPlaceOfExpiry; }

    public String getApplicableRules() { return applicableRules; }
    public void setApplicableRules(String applicableRules) { this.applicableRules = applicableRules; }

    public String getApplicantName() { return applicantName; }
    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }

    public String getApplicantAddress() { return applicantAddress; }
    public void setApplicantAddress(String applicantAddress) { this.applicantAddress = applicantAddress; }

    public String getBeneficiaryName() { return beneficiaryName; }
    public void setBeneficiaryName(String beneficiaryName) { this.beneficiaryName = beneficiaryName; }

    public String getBeneficiaryAddress() { return beneficiaryAddress; }
    public void setBeneficiaryAddress(String beneficiaryAddress) { this.beneficiaryAddress = beneficiaryAddress; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getCreditAmountTolerance() { return creditAmountTolerance; }
    public void setCreditAmountTolerance(String creditAmountTolerance) { this.creditAmountTolerance = creditAmountTolerance; }

    public String getCreditAvailableWith() { return creditAvailableWith; }
    public void setCreditAvailableWith(String creditAvailableWith) { this.creditAvailableWith = creditAvailableWith; }

    public String getCreditAvailableBy() { return creditAvailableBy; }
    public void setCreditAvailableBy(String creditAvailableBy) { this.creditAvailableBy = creditAvailableBy; }

    public String getDraftsAt() { return draftsAt; }
    public void setDraftsAt(String draftsAt) { this.draftsAt = draftsAt; }

    public String getDeferredPaymentDetails() { return deferredPaymentDetails; }
    public void setDeferredPaymentDetails(String deferredPaymentDetails) { this.deferredPaymentDetails = deferredPaymentDetails; }

    public String getMixedPaymentDetails() { return mixedPaymentDetails; }
    public void setMixedPaymentDetails(String mixedPaymentDetails) { this.mixedPaymentDetails = mixedPaymentDetails; }

    public String getDraftsDrawnOn() { return draftsDrawnOn; }
    public void setDraftsDrawnOn(String draftsDrawnOn) { this.draftsDrawnOn = draftsDrawnOn; }

    public boolean isPartialShipments() { return partialShipments; }
    public void setPartialShipments(boolean partialShipments) { this.partialShipments = partialShipments; }

    public boolean isTransshipments() { return transshipments; }
    public void setTransshipments(boolean transshipments) { this.transshipments = transshipments; }

    public String getPlaceOfTakingInCharge() { return placeOfTakingInCharge; }
    public void setPlaceOfTakingInCharge(String placeOfTakingInCharge) { this.placeOfTakingInCharge = placeOfTakingInCharge; }

    public String getPortOfLoading() { return portOfLoading; }
    public void setPortOfLoading(String portOfLoading) { this.portOfLoading = portOfLoading; }

    public String getPortOfDischarge() { return portOfDischarge; }
    public void setPortOfDischarge(String portOfDischarge) { this.portOfDischarge = portOfDischarge; }

    public String getFinalDestination() { return finalDestination; }
    public void setFinalDestination(String finalDestination) { this.finalDestination = finalDestination; }

    public String getLatestShipmentDate() { return latestShipmentDate; }
    public void setLatestShipmentDate(String latestShipmentDate) { this.latestShipmentDate = latestShipmentDate; }

    public String getModeOfShipment() { return modeOfShipment; }
    public void setModeOfShipment(String modeOfShipment) { this.modeOfShipment = modeOfShipment; }

    public String getGoodsDescription() { return goodsDescription; }
    public void setGoodsDescription(String goodsDescription) { this.goodsDescription = goodsDescription; }

    public String getContractTerms() { return contractTerms; }
    public void setContractTerms(String contractTerms) { this.contractTerms = contractTerms; }

    public String getHsCode() { return hsCode; }
    public void setHsCode(String hsCode) { this.hsCode = hsCode; }

    public List<String> getDocumentsRequired() { return documentsRequired; }
    public void setDocumentsRequired(List<String> documentsRequired) { this.documentsRequired = documentsRequired; }

    public String getApplicantBankCharges() { return applicantBankCharges; }
    public void setApplicantBankCharges(String applicantBankCharges) { this.applicantBankCharges = applicantBankCharges; }

    public String getBeneficiaryBankCharges() { return beneficiaryBankCharges; }
    public void setBeneficiaryBankCharges(String beneficiaryBankCharges) { this.beneficiaryBankCharges = beneficiaryBankCharges; }

    public String getPresentationPeriod() { return presentationPeriod; }
    public void setPresentationPeriod(String presentationPeriod) { this.presentationPeriod = presentationPeriod; }

    public String getConfirmationInstructions() { return confirmationInstructions; }
    public void setConfirmationInstructions(String confirmationInstructions) { this.confirmationInstructions = confirmationInstructions; }

    public String getConfirmationCharges() { return confirmationCharges; }
    public void setConfirmationCharges(String confirmationCharges) { this.confirmationCharges = confirmationCharges; }

    public String getAdviseThroughBankName() { return adviseThroughBankName; }
    public void setAdviseThroughBankName(String adviseThroughBankName) { this.adviseThroughBankName = adviseThroughBankName; }

    public String getAdviseThroughBankAddress() { return adviseThroughBankAddress; }
    public void setAdviseThroughBankAddress(String adviseThroughBankAddress) { this.adviseThroughBankAddress = adviseThroughBankAddress; }

    public String getAdviseThroughBankIfscCode() { return adviseThroughBankIfscCode; }
    public void setAdviseThroughBankIfscCode(String adviseThroughBankIfscCode) { this.adviseThroughBankIfscCode = adviseThroughBankIfscCode; }

    public String getInstructionsToBank() { return instructionsToBank; }
    public void setInstructionsToBank(String instructionsToBank) { this.instructionsToBank = instructionsToBank; }

}
