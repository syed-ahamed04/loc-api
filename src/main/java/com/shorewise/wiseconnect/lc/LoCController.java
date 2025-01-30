package com.shorewise.wiseconnect.lc;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/lc")
public class LoCController {

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> createLC(@RequestBody LCRequest lcRequest) {
        String lcNumber = "LC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        return ResponseEntity.ok(new Response("Success", lcNumber));
    }

    // Request Body Class
    static class LCRequest {
        private String dateAndPlaceOfExpiry;
        private String applicableRules;
        private Party applicant;
        private Party beneficiary;
        private CurrencyAndAmount currencyAndAmount;
        private String creditAmountTolerance;
        private String creditAvailableWith;
        private String creditAvailableBy;
        private String draftsAt;
        private String deferredPaymentDetails;
        private String mixedPaymentDetails;
        private String draftsDrawnOn;
        private String partialShipments;
        private String transshipments;
        private ShipmentDetails shipmentDetails;
        private String contractTerms;
        private String importLicenseDetails;
        private List<String> documentsRequired;
        private String charges;
        private String presentationPeriod;
        private String confirmationInstructions;
        private String confirmationCharges;
        private String adviseThroughBank;
        private String instructionsToNegotiatingBank;

        // Getters and Setters
        public String getDateAndPlaceOfExpiry() { return dateAndPlaceOfExpiry; }
        public void setDateAndPlaceOfExpiry(String dateAndPlaceOfExpiry) { this.dateAndPlaceOfExpiry = dateAndPlaceOfExpiry; }

        public String getApplicableRules() { return applicableRules; }
        public void setApplicableRules(String applicableRules) { this.applicableRules = applicableRules; }

        public Party getApplicant() { return applicant; }
        public void setApplicant(Party applicant) { this.applicant = applicant; }

        public Party getBeneficiary() { return beneficiary; }
        public void setBeneficiary(Party beneficiary) { this.beneficiary = beneficiary; }

        public CurrencyAndAmount getCurrencyAndAmount() { return currencyAndAmount; }
        public void setCurrencyAndAmount(CurrencyAndAmount currencyAndAmount) { this.currencyAndAmount = currencyAndAmount; }

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

        public String getPartialShipments() { return partialShipments; }
        public void setPartialShipments(String partialShipments) { this.partialShipments = partialShipments; }

        public String getTransshipments() { return transshipments; }
        public void setTransshipments(String transshipments) { this.transshipments = transshipments; }

        public ShipmentDetails getShipmentDetails() { return shipmentDetails; }
        public void setShipmentDetails(ShipmentDetails shipmentDetails) { this.shipmentDetails = shipmentDetails; }

        public String getContractTerms() { return contractTerms; }
        public void setContractTerms(String contractTerms) { this.contractTerms = contractTerms; }

        public String getImportLicenseDetails() { return importLicenseDetails; }
        public void setImportLicenseDetails(String importLicenseDetails) { this.importLicenseDetails = importLicenseDetails; }

        public List<String> getDocumentsRequired() { return documentsRequired; }
        public void setDocumentsRequired(List<String> documentsRequired) { this.documentsRequired = documentsRequired; }

        public String getCharges() { return charges; }
        public void setCharges(String charges) { this.charges = charges; }

        public String getPresentationPeriod() { return presentationPeriod; }
        public void setPresentationPeriod(String presentationPeriod) { this.presentationPeriod = presentationPeriod; }

        public String getConfirmationInstructions() { return confirmationInstructions; }
        public void setConfirmationInstructions(String confirmationInstructions) { this.confirmationInstructions = confirmationInstructions; }

        public String getConfirmationCharges() { return confirmationCharges; }
        public void setConfirmationCharges(String confirmationCharges) { this.confirmationCharges = confirmationCharges; }

        public String getAdviseThroughBank() { return adviseThroughBank; }
        public void setAdviseThroughBank(String adviseThroughBank) { this.adviseThroughBank = adviseThroughBank; }

        public String getInstructionsToNegotiatingBank() { return instructionsToNegotiatingBank; }
        public void setInstructionsToNegotiatingBank(String instructionsToNegotiatingBank) { this.instructionsToNegotiatingBank = instructionsToNegotiatingBank; }
    }

    // Nested Classes for JSON Fields
    static class Party {
        private String name;
        private String address;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }

    static class CurrencyAndAmount {
        private String currency;
        private double amount;

        public String getCurrency() { return currency; }
        public void setCurrency(String currency) { this.currency = currency; }

        public double getAmount() { return amount; }
        public void setAmount(double amount) { this.amount = amount; }
    }

    static class ShipmentDetails {
        private String placeOfTakingInCharge;
        private String portOfLoading;
        private String shipmentPeriod;
        private Commodity commodity;

        public String getPlaceOfTakingInCharge() { return placeOfTakingInCharge; }
        public void setPlaceOfTakingInCharge(String placeOfTakingInCharge) { this.placeOfTakingInCharge = placeOfTakingInCharge; }

        public String getPortOfLoading() { return portOfLoading; }
        public void setPortOfLoading(String portOfLoading) { this.portOfLoading = portOfLoading; }

        public String getShipmentPeriod() { return shipmentPeriod; }
        public void setShipmentPeriod(String shipmentPeriod) { this.shipmentPeriod = shipmentPeriod; }

        public Commodity getCommodity() { return commodity; }
        public void setCommodity(Commodity commodity) { this.commodity = commodity; }
    }

    static class Commodity {
        private String description;
        private String hsCode;

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public String getHsCode() { return hsCode; }
        public void setHsCode(String hsCode) { this.hsCode = hsCode; }
    }

    // Response Class
    static class Response {
        private String status;
        private String message;

        public Response(String status, String message) {
            this.status = status;
            this.message = message;
        }

        public String getStatus() { return status; }
        public String getMessage() { return message; }
    }
}
