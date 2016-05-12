
package com.sf.kyc.vas.soap.webservice.artifact;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sf.kyc.vas.soap.webservice.artifact package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccumulatorDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "AccumulatorDetails");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _RefillValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "RefillValue");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AccountDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "AccountDetails");
    private final static QName _RefillResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "RefillResponse");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "ResponseBase");
    private final static QName _DedicatedAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "DedicatedAccount");
    private final static QName _ArrayOfAccumulator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "ArrayOfAccumulator");
    private final static QName _AccountFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "AccountFlag");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ArrayOfKeyValueOfintboolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintboolean");
    private final static QName _ChargingResultInformationService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "ChargingResultInformationService");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Accumulator_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "Accumulator");
    private final static QName _BalanceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "BalanceInfo");
    private final static QName _ArrayOfDedicatedAccountInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "ArrayOfDedicatedAccountInformation");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _FafInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "FafInfo");
    private final static QName _AccountRefill_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "AccountRefill");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfFafInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "ArrayOfFafInfo");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _GetBalanceAndDateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "GetBalanceAndDateResponse");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ChargingResultInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "ChargingResultInformation");
    private final static QName _RefillInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "RefillInformation");
    private final static QName _DedicatedAccountInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "DedicatedAccountInformation");
    private final static QName _DedicatedAccountRefillInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "DedicatedAccountRefillInformation");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfDedicatedAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "ArrayOfDedicatedAccount");
    private final static QName _ArrayOfDedicatedAccountRefillInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "ArrayOfDedicatedAccountRefillInformation");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AdjustDedicatedAccountWithFixedDateIdentifier_QNAME = new QName("http://tempuri.org/", "identifier");
    private final static QName _AdjustDedicatedAccountWithFixedDateMsisdn_QNAME = new QName("http://tempuri.org/", "msisdn");
    private final static QName _AccumulatorDetailsAccumulators_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "Accumulators");
    private final static QName _AdjustBalanceExternalData1_QNAME = new QName("http://tempuri.org/", "externalData1");
    private final static QName _UpdateSubscriberSegmentation3ServiceValues_QNAME = new QName("http://tempuri.org/", "serviceValues");
    private final static QName _GetBalanceAndDateResponse2AccountValue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "accountValue2");
    private final static QName _GetBalanceAndDateResponse2AccountValue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "accountValue1");
    private final static QName _GetBalanceAndDateResponse2CreditClearanceDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "creditClearanceDate");
    private final static QName _GetBalanceAndDateResponse2SupervisionExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "supervisionExpiryDate");
    private final static QName _GetBalanceAndDateResponse2Currency2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "currency2");
    private final static QName _GetBalanceAndDateResponse2ServiceRemovalDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceRemovalDate");
    private final static QName _GetBalanceAndDateResponse2Currency1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "currency1");
    private final static QName _GetBalanceAndDateResponse2DedicatedAccountInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "dedicatedAccountInformation");
    private final static QName _GetBalanceAndDateResponse2TemporaryBlockedFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "temporaryBlockedFlag");
    private final static QName _GetBalanceAndDateResponse2ServiceFeeExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceFeeExpiryDate");
    private final static QName _ChargingResultInformationServiceCost1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "cost1");
    private final static QName _ChargingResultInformationServiceCost2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "cost2");
    private final static QName _RefillResponse2AccountAfterRefill_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "accountAfterRefill");
    private final static QName _RefillResponse2SelectedOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "selectedOption");
    private final static QName _RefillResponse2TransactionCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "transactionCurrency");
    private final static QName _RefillResponse2AccountBeforeRefill_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "accountBeforeRefill");
    private final static QName _RefillResponse2RefillInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillInformation");
    private final static QName _RefillResponse2VoucherAgent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "voucherAgent");
    private final static QName _RefillResponse2VoucherGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "voucherGroup");
    private final static QName _RefillResponse2RefillFraudCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillFraudCount");
    private final static QName _RefillResponse2VoucherSerialNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "voucherSerialNumber");
    private final static QName _RefillResponse2MasterAccountNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "masterAccountNumber");
    private final static QName _RefillResponse2PromotionAnnouncementCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionAnnouncementCode");
    private final static QName _RefillResponse2TransactionAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "transactionAmount");
    private final static QName _RefillResponse2TransactionAmountConverted_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "transactionAmountConverted");
    private final static QName _DedicatedAccountExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "ExpiryDate");
    private final static QName _GetBalanceInfoResponseGetBalanceInfoResult_QNAME = new QName("http://tempuri.org/", "GetBalanceInfoResult");
    private final static QName _DedicatedAccountRefillInformationClearedValue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "clearedValue1");
    private final static QName _DedicatedAccountRefillInformationClearedValue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "clearedValue2");
    private final static QName _DedicatedAccountRefillInformationRefillAmount1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillAmount1");
    private final static QName _DedicatedAccountRefillInformationRefillAmount2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillAmount2");
    private final static QName _BalanceInfoCurrency1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "Currency1");
    private final static QName _BalanceInfoCurrency2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "Currency2");
    private final static QName _BalanceInfoDedicatedAccountInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "DedicatedAccountInformation");
    private final static QName _ResponseBaseChargingResultInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "chargingResultInformation");
    private final static QName _ResponseBaseOriginOperatorID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "originOperatorID");
    private final static QName _ResponseBaseLanguageIDCurrent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "languageIDCurrent");
    private final static QName _ResponseBaseOriginTransactionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "originTransactionID");
    private final static QName _RefillResponseRefillResult_QNAME = new QName("http://tempuri.org/", "RefillResult");
    private final static QName _RefillValueServiceFeeDaysExtended_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceFeeDaysExtended");
    private final static QName _RefillValueSupervisionDaysExtended_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "supervisionDaysExtended");
    private final static QName _RefillValueDedicatedAccountRefillInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "dedicatedAccountRefillInformation");
    private final static QName _AccountRefillPromotionPlanID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionPlanID");
    private final static QName _AccountRefillServiceClassOriginal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceClassOriginal");
    private final static QName _AccountRefillServiceClassTemporaryExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceClassTemporaryExpiryDate");
    private final static QName _AccountRefillAccountFlags_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "accountFlags");
    private final static QName _GetAccumulatorsResponseGetAccumulatorsResult_QNAME = new QName("http://tempuri.org/", "GetAccumulatorsResult");
    private final static QName _GetBalanceAndDateResponseGetBalanceAndDateResult_QNAME = new QName("http://tempuri.org/", "GetBalanceAndDateResult");
    private final static QName _AccountDetailsServiceOfferings_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "ServiceOfferings");
    private final static QName _AccountFlagServiceFeePeriodExpiryFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceFeePeriodExpiryFlag");
    private final static QName _AccountFlagServiceFeePeriodWarningActiveFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceFeePeriodWarningActiveFlag");
    private final static QName _AccountFlagActivationStatusFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "activationStatusFlag");
    private final static QName _AccountFlagSupervisionPeriodWarningActiveFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "supervisionPeriodWarningActiveFlag");
    private final static QName _AccountFlagSupervisionPeriodExpiryFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "supervisionPeriodExpiryFlag");
    private final static QName _AccountFlagNegativeBarringStatusFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "negativeBarringStatusFlag");
    private final static QName _FafInfoFafNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "FafNumber");
    private final static QName _FafInfoOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models", "Owner");
    private final static QName _GetFaFListResponseGetFaFListResult_QNAME = new QName("http://tempuri.org/", "GetFaFListResult");
    private final static QName _GetAccountDetailsResponseGetAccountDetailsResult_QNAME = new QName("http://tempuri.org/", "GetAccountDetailsResult");
    private final static QName _RefillInformationPromotionPlanProgressed_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionPlanProgressed");
    private final static QName _RefillInformationPromotionRefillCounter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionRefillCounter");
    private final static QName _RefillInformationSupervisionDaysSurplus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "supervisionDaysSurplus");
    private final static QName _RefillInformationPromotionRefillAccumulatedValue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionRefillAccumulatedValue1");
    private final static QName _RefillInformationProgressionRefillCounter_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "progressionRefillCounter");
    private final static QName _RefillInformationPromotionRefillAccumulatedValue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "promotionRefillAccumulatedValue2");
    private final static QName _RefillInformationRefillValueTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillValueTotal");
    private final static QName _RefillInformationProgressionRefillValue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "progressionRefillValue1");
    private final static QName _RefillInformationServiceFeeDaysSurplus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceFeeDaysSurplus");
    private final static QName _RefillInformationProgressionRefillValue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "progressionRefillValue2");
    private final static QName _RefillInformationRefillValuePromotion_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "refillValuePromotion");
    private final static QName _RefillInformationServiceClassCurrent_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "serviceClassCurrent");
    private final static QName _DedicatedAccountInformationExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "expiryDate");
    private final static QName _DedicatedAccountInformationDedicatedAccountValue1_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "dedicatedAccountValue1");
    private final static QName _DedicatedAccountInformationDedicatedAccountValue2_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "dedicatedAccountValue2");
    private final static QName _ChargingResultInformationChargingResultInformationService_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "chargingResultInformationService");
    private final static QName _ChargingResultInformationReservationCorrelationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "reservationCorrelationID");
    private final static QName _ChargingResultInformationChargingResultCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", "chargingResultCode");
    private final static QName _UpdateSubscriberSegmentation2ServiceId_QNAME = new QName("http://tempuri.org/", "serviceId");
    private final static QName _GetAccumulatorDetailsResponseGetAccumulatorDetailsResult_QNAME = new QName("http://tempuri.org/", "GetAccumulatorDetailsResult");
    private final static QName _RefillVoucher_QNAME = new QName("http://tempuri.org/", "voucher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sf.kyc.vas.soap.webservice.artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintboolean }
     * 
     */
    public ArrayOfKeyValueOfintboolean createArrayOfKeyValueOfintboolean() {
        return new ArrayOfKeyValueOfintboolean();
    }

    /**
     * Create an instance of {@link GetAccumulatorsResponse }
     * 
     */
    public GetAccumulatorsResponse createGetAccumulatorsResponse() {
        return new GetAccumulatorsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccumulator }
     * 
     */
    public ArrayOfAccumulator createArrayOfAccumulator() {
        return new ArrayOfAccumulator();
    }

    /**
     * Create an instance of {@link RefillResponse }
     * 
     */
    public RefillResponse createRefillResponse() {
        return new RefillResponse();
    }

    /**
     * Create an instance of {@link RefillResponse2 }
     * 
     */
    public RefillResponse2 createRefillResponse2() {
        return new RefillResponse2();
    }

    /**
     * Create an instance of {@link GetFaFList }
     * 
     */
    public GetFaFList createGetFaFList() {
        return new GetFaFList();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation3 }
     * 
     */
    public UpdateSubscriberSegmentation3 createUpdateSubscriberSegmentation3() {
        return new UpdateSubscriberSegmentation3();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation2Response }
     * 
     */
    public UpdateSubscriberSegmentation2Response createUpdateSubscriberSegmentation2Response() {
        return new UpdateSubscriberSegmentation2Response();
    }

    /**
     * Create an instance of {@link FixDedicatedAccountResponse }
     * 
     */
    public FixDedicatedAccountResponse createFixDedicatedAccountResponse() {
        return new FixDedicatedAccountResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation3Response }
     * 
     */
    public UpdateSubscriberSegmentation3Response createUpdateSubscriberSegmentation3Response() {
        return new UpdateSubscriberSegmentation3Response();
    }

    /**
     * Create an instance of {@link AdjustBalanceResponse }
     * 
     */
    public AdjustBalanceResponse createAdjustBalanceResponse() {
        return new AdjustBalanceResponse();
    }

    /**
     * Create an instance of {@link GetAccountDetailsResponse }
     * 
     */
    public GetAccountDetailsResponse createGetAccountDetailsResponse() {
        return new GetAccountDetailsResponse();
    }

    /**
     * Create an instance of {@link AccountDetails }
     * 
     */
    public AccountDetails createAccountDetails() {
        return new AccountDetails();
    }

    /**
     * Create an instance of {@link GetAccountDetails }
     * 
     */
    public GetAccountDetails createGetAccountDetails() {
        return new GetAccountDetails();
    }

    /**
     * Create an instance of {@link GetBalanceAndDate }
     * 
     */
    public GetBalanceAndDate createGetBalanceAndDate() {
        return new GetBalanceAndDate();
    }

    /**
     * Create an instance of {@link FixDedicatedAccountAAPCN }
     * 
     */
    public FixDedicatedAccountAAPCN createFixDedicatedAccountAAPCN() {
        return new FixDedicatedAccountAAPCN();
    }

    /**
     * Create an instance of {@link AdjustDedicatedAccountResponse }
     * 
     */
    public AdjustDedicatedAccountResponse createAdjustDedicatedAccountResponse() {
        return new AdjustDedicatedAccountResponse();
    }

    /**
     * Create an instance of {@link GetServiceClassResponse }
     * 
     */
    public GetServiceClassResponse createGetServiceClassResponse() {
        return new GetServiceClassResponse();
    }

    /**
     * Create an instance of {@link FixDedicatedAccountAAPCNResponse }
     * 
     */
    public FixDedicatedAccountAAPCNResponse createFixDedicatedAccountAAPCNResponse() {
        return new FixDedicatedAccountAAPCNResponse();
    }

    /**
     * Create an instance of {@link AdjustBalance }
     * 
     */
    public AdjustBalance createAdjustBalance() {
        return new AdjustBalance();
    }

    /**
     * Create an instance of {@link GetAccumulatorDetailsResponse }
     * 
     */
    public GetAccumulatorDetailsResponse createGetAccumulatorDetailsResponse() {
        return new GetAccumulatorDetailsResponse();
    }

    /**
     * Create an instance of {@link AccumulatorDetails }
     * 
     */
    public AccumulatorDetails createAccumulatorDetails() {
        return new AccumulatorDetails();
    }

    /**
     * Create an instance of {@link GetAccumulators }
     * 
     */
    public GetAccumulators createGetAccumulators() {
        return new GetAccumulators();
    }

    /**
     * Create an instance of {@link GetBalanceInfoResponse }
     * 
     */
    public GetBalanceInfoResponse createGetBalanceInfoResponse() {
        return new GetBalanceInfoResponse();
    }

    /**
     * Create an instance of {@link BalanceInfo }
     * 
     */
    public BalanceInfo createBalanceInfo() {
        return new BalanceInfo();
    }

    /**
     * Create an instance of {@link AdjustDedicatedAccount }
     * 
     */
    public AdjustDedicatedAccount createAdjustDedicatedAccount() {
        return new AdjustDedicatedAccount();
    }

    /**
     * Create an instance of {@link GetAccumulatorDetails }
     * 
     */
    public GetAccumulatorDetails createGetAccumulatorDetails() {
        return new GetAccumulatorDetails();
    }

    /**
     * Create an instance of {@link GetBalanceInfo }
     * 
     */
    public GetBalanceInfo createGetBalanceInfo() {
        return new GetBalanceInfo();
    }

    /**
     * Create an instance of {@link GetBalanceAndDateResponse }
     * 
     */
    public GetBalanceAndDateResponse createGetBalanceAndDateResponse() {
        return new GetBalanceAndDateResponse();
    }

    /**
     * Create an instance of {@link GetBalanceAndDateResponse2 }
     * 
     */
    public GetBalanceAndDateResponse2 createGetBalanceAndDateResponse2() {
        return new GetBalanceAndDateResponse2();
    }

    /**
     * Create an instance of {@link AdjustDedicatedAccountWithFixedDateResponse }
     * 
     */
    public AdjustDedicatedAccountWithFixedDateResponse createAdjustDedicatedAccountWithFixedDateResponse() {
        return new AdjustDedicatedAccountWithFixedDateResponse();
    }

    /**
     * Create an instance of {@link ChangeServiceClass }
     * 
     */
    public ChangeServiceClass createChangeServiceClass() {
        return new ChangeServiceClass();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation1 }
     * 
     */
    public UpdateSubscriberSegmentation1 createUpdateSubscriberSegmentation1() {
        return new UpdateSubscriberSegmentation1();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation2 }
     * 
     */
    public UpdateSubscriberSegmentation2 createUpdateSubscriberSegmentation2() {
        return new UpdateSubscriberSegmentation2();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link SetDedicatedAccountResponse }
     * 
     */
    public SetDedicatedAccountResponse createSetDedicatedAccountResponse() {
        return new SetDedicatedAccountResponse();
    }

    /**
     * Create an instance of {@link FixDedicatedAccount }
     * 
     */
    public FixDedicatedAccount createFixDedicatedAccount() {
        return new FixDedicatedAccount();
    }

    /**
     * Create an instance of {@link GetServiceClass }
     * 
     */
    public GetServiceClass createGetServiceClass() {
        return new GetServiceClass();
    }

    /**
     * Create an instance of {@link ChangeServiceClassResponse }
     * 
     */
    public ChangeServiceClassResponse createChangeServiceClassResponse() {
        return new ChangeServiceClassResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscriberSegmentation1Response }
     * 
     */
    public UpdateSubscriberSegmentation1Response createUpdateSubscriberSegmentation1Response() {
        return new UpdateSubscriberSegmentation1Response();
    }

    /**
     * Create an instance of {@link SetDedicatedAccount }
     * 
     */
    public SetDedicatedAccount createSetDedicatedAccount() {
        return new SetDedicatedAccount();
    }

    /**
     * Create an instance of {@link Refill }
     * 
     */
    public Refill createRefill() {
        return new Refill();
    }

    /**
     * Create an instance of {@link AdjustDedicatedAccountWithFixedDate }
     * 
     */
    public AdjustDedicatedAccountWithFixedDate createAdjustDedicatedAccountWithFixedDate() {
        return new AdjustDedicatedAccountWithFixedDate();
    }

    /**
     * Create an instance of {@link GetFaFListResponse }
     * 
     */
    public GetFaFListResponse createGetFaFListResponse() {
        return new GetFaFListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFafInfo }
     * 
     */
    public ArrayOfFafInfo createArrayOfFafInfo() {
        return new ArrayOfFafInfo();
    }

    /**
     * Create an instance of {@link Accumulator }
     * 
     */
    public Accumulator createAccumulator() {
        return new Accumulator();
    }

    /**
     * Create an instance of {@link FafInfo }
     * 
     */
    public FafInfo createFafInfo() {
        return new FafInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDedicatedAccount }
     * 
     */
    public ArrayOfDedicatedAccount createArrayOfDedicatedAccount() {
        return new ArrayOfDedicatedAccount();
    }

    /**
     * Create an instance of {@link DedicatedAccount }
     * 
     */
    public DedicatedAccount createDedicatedAccount() {
        return new DedicatedAccount();
    }

    /**
     * Create an instance of {@link RefillInformation }
     * 
     */
    public RefillInformation createRefillInformation() {
        return new RefillInformation();
    }

    /**
     * Create an instance of {@link ChargingResultInformation }
     * 
     */
    public ChargingResultInformation createChargingResultInformation() {
        return new ChargingResultInformation();
    }

    /**
     * Create an instance of {@link DedicatedAccountInformation }
     * 
     */
    public DedicatedAccountInformation createDedicatedAccountInformation() {
        return new DedicatedAccountInformation();
    }

    /**
     * Create an instance of {@link DedicatedAccountRefillInformation }
     * 
     */
    public DedicatedAccountRefillInformation createDedicatedAccountRefillInformation() {
        return new DedicatedAccountRefillInformation();
    }

    /**
     * Create an instance of {@link AccountRefill }
     * 
     */
    public AccountRefill createAccountRefill() {
        return new AccountRefill();
    }

    /**
     * Create an instance of {@link RefillValue }
     * 
     */
    public RefillValue createRefillValue() {
        return new RefillValue();
    }

    /**
     * Create an instance of {@link ChargingResultInformationService }
     * 
     */
    public ChargingResultInformationService createChargingResultInformationService() {
        return new ChargingResultInformationService();
    }

    /**
     * Create an instance of {@link ArrayOfDedicatedAccountInformation }
     * 
     */
    public ArrayOfDedicatedAccountInformation createArrayOfDedicatedAccountInformation() {
        return new ArrayOfDedicatedAccountInformation();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link AccountFlag }
     * 
     */
    public AccountFlag createAccountFlag() {
        return new AccountFlag();
    }

    /**
     * Create an instance of {@link ArrayOfDedicatedAccountRefillInformation }
     * 
     */
    public ArrayOfDedicatedAccountRefillInformation createArrayOfDedicatedAccountRefillInformation() {
        return new ArrayOfDedicatedAccountRefillInformation();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintboolean.KeyValueOfintboolean }
     * 
     */
    public ArrayOfKeyValueOfintboolean.KeyValueOfintboolean createArrayOfKeyValueOfintbooleanKeyValueOfintboolean() {
        return new ArrayOfKeyValueOfintboolean.KeyValueOfintboolean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccumulatorDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "AccumulatorDetails")
    public JAXBElement<AccumulatorDetails> createAccumulatorDetails(AccumulatorDetails value) {
        return new JAXBElement<AccumulatorDetails>(_AccumulatorDetails_QNAME, AccumulatorDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "RefillValue")
    public JAXBElement<RefillValue> createRefillValue(RefillValue value) {
        return new JAXBElement<RefillValue>(_RefillValue_QNAME, RefillValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "AccountDetails")
    public JAXBElement<AccountDetails> createAccountDetails(AccountDetails value) {
        return new JAXBElement<AccountDetails>(_AccountDetails_QNAME, AccountDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "RefillResponse")
    public JAXBElement<RefillResponse2> createRefillResponse(RefillResponse2 value) {
        return new JAXBElement<RefillResponse2>(_RefillResponse_QNAME, RefillResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DedicatedAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "DedicatedAccount")
    public JAXBElement<DedicatedAccount> createDedicatedAccount(DedicatedAccount value) {
        return new JAXBElement<DedicatedAccount>(_DedicatedAccount_QNAME, DedicatedAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccumulator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "ArrayOfAccumulator")
    public JAXBElement<ArrayOfAccumulator> createArrayOfAccumulator(ArrayOfAccumulator value) {
        return new JAXBElement<ArrayOfAccumulator>(_ArrayOfAccumulator_QNAME, ArrayOfAccumulator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "AccountFlag")
    public JAXBElement<AccountFlag> createAccountFlag(AccountFlag value) {
        return new JAXBElement<AccountFlag>(_AccountFlag_QNAME, AccountFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintboolean")
    public JAXBElement<ArrayOfKeyValueOfintboolean> createArrayOfKeyValueOfintboolean(ArrayOfKeyValueOfintboolean value) {
        return new JAXBElement<ArrayOfKeyValueOfintboolean>(_ArrayOfKeyValueOfintboolean_QNAME, ArrayOfKeyValueOfintboolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargingResultInformationService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "ChargingResultInformationService")
    public JAXBElement<ChargingResultInformationService> createChargingResultInformationService(ChargingResultInformationService value) {
        return new JAXBElement<ChargingResultInformationService>(_ChargingResultInformationService_QNAME, ChargingResultInformationService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Accumulator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "Accumulator")
    public JAXBElement<Accumulator> createAccumulator(Accumulator value) {
        return new JAXBElement<Accumulator>(_Accumulator_QNAME, Accumulator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "BalanceInfo")
    public JAXBElement<BalanceInfo> createBalanceInfo(BalanceInfo value) {
        return new JAXBElement<BalanceInfo>(_BalanceInfo_QNAME, BalanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "ArrayOfDedicatedAccountInformation")
    public JAXBElement<ArrayOfDedicatedAccountInformation> createArrayOfDedicatedAccountInformation(ArrayOfDedicatedAccountInformation value) {
        return new JAXBElement<ArrayOfDedicatedAccountInformation>(_ArrayOfDedicatedAccountInformation_QNAME, ArrayOfDedicatedAccountInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FafInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "FafInfo")
    public JAXBElement<FafInfo> createFafInfo(FafInfo value) {
        return new JAXBElement<FafInfo>(_FafInfo_QNAME, FafInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "AccountRefill")
    public JAXBElement<AccountRefill> createAccountRefill(AccountRefill value) {
        return new JAXBElement<AccountRefill>(_AccountRefill_QNAME, AccountRefill.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFafInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "ArrayOfFafInfo")
    public JAXBElement<ArrayOfFafInfo> createArrayOfFafInfo(ArrayOfFafInfo value) {
        return new JAXBElement<ArrayOfFafInfo>(_ArrayOfFafInfo_QNAME, ArrayOfFafInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceAndDateResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "GetBalanceAndDateResponse")
    public JAXBElement<GetBalanceAndDateResponse2> createGetBalanceAndDateResponse(GetBalanceAndDateResponse2 value) {
        return new JAXBElement<GetBalanceAndDateResponse2>(_GetBalanceAndDateResponse_QNAME, GetBalanceAndDateResponse2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargingResultInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "ChargingResultInformation")
    public JAXBElement<ChargingResultInformation> createChargingResultInformation(ChargingResultInformation value) {
        return new JAXBElement<ChargingResultInformation>(_ChargingResultInformation_QNAME, ChargingResultInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "RefillInformation")
    public JAXBElement<RefillInformation> createRefillInformation(RefillInformation value) {
        return new JAXBElement<RefillInformation>(_RefillInformation_QNAME, RefillInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DedicatedAccountInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "DedicatedAccountInformation")
    public JAXBElement<DedicatedAccountInformation> createDedicatedAccountInformation(DedicatedAccountInformation value) {
        return new JAXBElement<DedicatedAccountInformation>(_DedicatedAccountInformation_QNAME, DedicatedAccountInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DedicatedAccountRefillInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "DedicatedAccountRefillInformation")
    public JAXBElement<DedicatedAccountRefillInformation> createDedicatedAccountRefillInformation(DedicatedAccountRefillInformation value) {
        return new JAXBElement<DedicatedAccountRefillInformation>(_DedicatedAccountRefillInformation_QNAME, DedicatedAccountRefillInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "ArrayOfDedicatedAccount")
    public JAXBElement<ArrayOfDedicatedAccount> createArrayOfDedicatedAccount(ArrayOfDedicatedAccount value) {
        return new JAXBElement<ArrayOfDedicatedAccount>(_ArrayOfDedicatedAccount_QNAME, ArrayOfDedicatedAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountRefillInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "ArrayOfDedicatedAccountRefillInformation")
    public JAXBElement<ArrayOfDedicatedAccountRefillInformation> createArrayOfDedicatedAccountRefillInformation(ArrayOfDedicatedAccountRefillInformation value) {
        return new JAXBElement<ArrayOfDedicatedAccountRefillInformation>(_ArrayOfDedicatedAccountRefillInformation_QNAME, ArrayOfDedicatedAccountRefillInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = AdjustDedicatedAccountWithFixedDate.class)
    public JAXBElement<String> createAdjustDedicatedAccountWithFixedDateIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, AdjustDedicatedAccountWithFixedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = AdjustDedicatedAccountWithFixedDate.class)
    public JAXBElement<String> createAdjustDedicatedAccountWithFixedDateMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, AdjustDedicatedAccountWithFixedDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccumulator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "Accumulators", scope = AccumulatorDetails.class)
    public JAXBElement<ArrayOfAccumulator> createAccumulatorDetailsAccumulators(ArrayOfAccumulator value) {
        return new JAXBElement<ArrayOfAccumulator>(_AccumulatorDetailsAccumulators_QNAME, ArrayOfAccumulator.class, AccumulatorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = AdjustBalance.class)
    public JAXBElement<String> createAdjustBalanceMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, AdjustBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalData1", scope = AdjustBalance.class)
    public JAXBElement<String> createAdjustBalanceExternalData1(String value) {
        return new JAXBElement<String>(_AdjustBalanceExternalData1_QNAME, String.class, AdjustBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serviceValues", scope = UpdateSubscriberSegmentation3 .class)
    public JAXBElement<ArrayOfKeyValueOfintboolean> createUpdateSubscriberSegmentation3ServiceValues(ArrayOfKeyValueOfintboolean value) {
        return new JAXBElement<ArrayOfKeyValueOfintboolean>(_UpdateSubscriberSegmentation3ServiceValues_QNAME, ArrayOfKeyValueOfintboolean.class, UpdateSubscriberSegmentation3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = UpdateSubscriberSegmentation3 .class)
    public JAXBElement<String> createUpdateSubscriberSegmentation3Msisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, UpdateSubscriberSegmentation3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountValue2", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<String> createGetBalanceAndDateResponse2AccountValue2(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2AccountValue2_QNAME, String.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountValue1", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<String> createGetBalanceAndDateResponse2AccountValue1(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2AccountValue1_QNAME, String.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "creditClearanceDate", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetBalanceAndDateResponse2CreditClearanceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2CreditClearanceDate_QNAME, XMLGregorianCalendar.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionExpiryDate", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetBalanceAndDateResponse2SupervisionExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2SupervisionExpiryDate_QNAME, XMLGregorianCalendar.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency2", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<String> createGetBalanceAndDateResponse2Currency2(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency2_QNAME, String.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceRemovalDate", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetBalanceAndDateResponse2ServiceRemovalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2ServiceRemovalDate_QNAME, XMLGregorianCalendar.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency1", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<String> createGetBalanceAndDateResponse2Currency1(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency1_QNAME, String.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "dedicatedAccountInformation", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<ArrayOfDedicatedAccountInformation> createGetBalanceAndDateResponse2DedicatedAccountInformation(ArrayOfDedicatedAccountInformation value) {
        return new JAXBElement<ArrayOfDedicatedAccountInformation>(_GetBalanceAndDateResponse2DedicatedAccountInformation_QNAME, ArrayOfDedicatedAccountInformation.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "temporaryBlockedFlag", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<Boolean> createGetBalanceAndDateResponse2TemporaryBlockedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_GetBalanceAndDateResponse2TemporaryBlockedFlag_QNAME, Boolean.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeeExpiryDate", scope = GetBalanceAndDateResponse2 .class)
    public JAXBElement<XMLGregorianCalendar> createGetBalanceAndDateResponse2ServiceFeeExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2ServiceFeeExpiryDate_QNAME, XMLGregorianCalendar.class, GetBalanceAndDateResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetServiceClass.class)
    public JAXBElement<String> createGetServiceClassMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetServiceClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "cost1", scope = ChargingResultInformationService.class)
    public JAXBElement<String> createChargingResultInformationServiceCost1(String value) {
        return new JAXBElement<String>(_ChargingResultInformationServiceCost1_QNAME, String.class, ChargingResultInformationService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "cost2", scope = ChargingResultInformationService.class)
    public JAXBElement<String> createChargingResultInformationServiceCost2(String value) {
        return new JAXBElement<String>(_ChargingResultInformationServiceCost2_QNAME, String.class, ChargingResultInformationService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = AdjustDedicatedAccount.class)
    public JAXBElement<String> createAdjustDedicatedAccountIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, AdjustDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = AdjustDedicatedAccount.class)
    public JAXBElement<String> createAdjustDedicatedAccountMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, AdjustDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountAfterRefill", scope = RefillResponse2 .class)
    public JAXBElement<AccountRefill> createRefillResponse2AccountAfterRefill(AccountRefill value) {
        return new JAXBElement<AccountRefill>(_RefillResponse2AccountAfterRefill_QNAME, AccountRefill.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "selectedOption", scope = RefillResponse2 .class)
    public JAXBElement<Integer> createRefillResponse2SelectedOption(Integer value) {
        return new JAXBElement<Integer>(_RefillResponse2SelectedOption_QNAME, Integer.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "transactionCurrency", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2TransactionCurrency(String value) {
        return new JAXBElement<String>(_RefillResponse2TransactionCurrency_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountRefill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountBeforeRefill", scope = RefillResponse2 .class)
    public JAXBElement<AccountRefill> createRefillResponse2AccountBeforeRefill(AccountRefill value) {
        return new JAXBElement<AccountRefill>(_RefillResponse2AccountBeforeRefill_QNAME, AccountRefill.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillInformation", scope = RefillResponse2 .class)
    public JAXBElement<RefillInformation> createRefillResponse2RefillInformation(RefillInformation value) {
        return new JAXBElement<RefillInformation>(_RefillResponse2RefillInformation_QNAME, RefillInformation.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "voucherAgent", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2VoucherAgent(String value) {
        return new JAXBElement<String>(_RefillResponse2VoucherAgent_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "voucherGroup", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2VoucherGroup(String value) {
        return new JAXBElement<String>(_RefillResponse2VoucherGroup_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillFraudCount", scope = RefillResponse2 .class)
    public JAXBElement<Integer> createRefillResponse2RefillFraudCount(Integer value) {
        return new JAXBElement<Integer>(_RefillResponse2RefillFraudCount_QNAME, Integer.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "voucherSerialNumber", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2VoucherSerialNumber(String value) {
        return new JAXBElement<String>(_RefillResponse2VoucherSerialNumber_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency2", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2Currency2(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency2_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "masterAccountNumber", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2MasterAccountNumber(String value) {
        return new JAXBElement<String>(_RefillResponse2MasterAccountNumber_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionAnnouncementCode", scope = RefillResponse2 .class)
    public JAXBElement<Integer> createRefillResponse2PromotionAnnouncementCode(Integer value) {
        return new JAXBElement<Integer>(_RefillResponse2PromotionAnnouncementCode_QNAME, Integer.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency1", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2Currency1(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency1_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "transactionAmount", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2TransactionAmount(String value) {
        return new JAXBElement<String>(_RefillResponse2TransactionAmount_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "transactionAmountConverted", scope = RefillResponse2 .class)
    public JAXBElement<String> createRefillResponse2TransactionAmountConverted(String value) {
        return new JAXBElement<String>(_RefillResponse2TransactionAmountConverted_QNAME, String.class, RefillResponse2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "ExpiryDate", scope = DedicatedAccount.class)
    public JAXBElement<XMLGregorianCalendar> createDedicatedAccountExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DedicatedAccountExpiryDate_QNAME, XMLGregorianCalendar.class, DedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetAccumulators.class)
    public JAXBElement<String> createGetAccumulatorsMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetAccumulators.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = FixDedicatedAccount.class)
    public JAXBElement<String> createFixDedicatedAccountIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, FixDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = FixDedicatedAccount.class)
    public JAXBElement<String> createFixDedicatedAccountMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, FixDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetBalanceAndDate.class)
    public JAXBElement<String> createGetBalanceAndDateMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetBalanceAndDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetAccumulatorDetails.class)
    public JAXBElement<String> createGetAccumulatorDetailsMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetAccumulatorDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBalanceInfoResult", scope = GetBalanceInfoResponse.class)
    public JAXBElement<BalanceInfo> createGetBalanceInfoResponseGetBalanceInfoResult(BalanceInfo value) {
        return new JAXBElement<BalanceInfo>(_GetBalanceInfoResponseGetBalanceInfoResult_QNAME, BalanceInfo.class, GetBalanceInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = ChangeServiceClass.class)
    public JAXBElement<String> createChangeServiceClassIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, ChangeServiceClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = ChangeServiceClass.class)
    public JAXBElement<String> createChangeServiceClassMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, ChangeServiceClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "clearedValue1", scope = DedicatedAccountRefillInformation.class)
    public JAXBElement<String> createDedicatedAccountRefillInformationClearedValue1(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationClearedValue1_QNAME, String.class, DedicatedAccountRefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "clearedValue2", scope = DedicatedAccountRefillInformation.class)
    public JAXBElement<String> createDedicatedAccountRefillInformationClearedValue2(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationClearedValue2_QNAME, String.class, DedicatedAccountRefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillAmount1", scope = DedicatedAccountRefillInformation.class)
    public JAXBElement<String> createDedicatedAccountRefillInformationRefillAmount1(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationRefillAmount1_QNAME, String.class, DedicatedAccountRefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillAmount2", scope = DedicatedAccountRefillInformation.class)
    public JAXBElement<String> createDedicatedAccountRefillInformationRefillAmount2(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationRefillAmount2_QNAME, String.class, DedicatedAccountRefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "Currency1", scope = BalanceInfo.class)
    public JAXBElement<String> createBalanceInfoCurrency1(String value) {
        return new JAXBElement<String>(_BalanceInfoCurrency1_QNAME, String.class, BalanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "Currency2", scope = BalanceInfo.class)
    public JAXBElement<String> createBalanceInfoCurrency2(String value) {
        return new JAXBElement<String>(_BalanceInfoCurrency2_QNAME, String.class, BalanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "DedicatedAccountInformation", scope = BalanceInfo.class)
    public JAXBElement<ArrayOfDedicatedAccount> createBalanceInfoDedicatedAccountInformation(ArrayOfDedicatedAccount value) {
        return new JAXBElement<ArrayOfDedicatedAccount>(_BalanceInfoDedicatedAccountInformation_QNAME, ArrayOfDedicatedAccount.class, BalanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargingResultInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "chargingResultInformation", scope = ResponseBase.class)
    public JAXBElement<ChargingResultInformation> createResponseBaseChargingResultInformation(ChargingResultInformation value) {
        return new JAXBElement<ChargingResultInformation>(_ResponseBaseChargingResultInformation_QNAME, ChargingResultInformation.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "originOperatorID", scope = ResponseBase.class)
    public JAXBElement<Integer> createResponseBaseOriginOperatorID(Integer value) {
        return new JAXBElement<Integer>(_ResponseBaseOriginOperatorID_QNAME, Integer.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "languageIDCurrent", scope = ResponseBase.class)
    public JAXBElement<Integer> createResponseBaseLanguageIDCurrent(Integer value) {
        return new JAXBElement<Integer>(_ResponseBaseLanguageIDCurrent_QNAME, Integer.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "originTransactionID", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseOriginTransactionID(String value) {
        return new JAXBElement<String>(_ResponseBaseOriginTransactionID_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RefillResult", scope = RefillResponse.class)
    public JAXBElement<RefillResponse2> createRefillResponseRefillResult(RefillResponse2 value) {
        return new JAXBElement<RefillResponse2>(_RefillResponseRefillResult_QNAME, RefillResponse2 .class, RefillResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeeDaysExtended", scope = RefillValue.class)
    public JAXBElement<Integer> createRefillValueServiceFeeDaysExtended(Integer value) {
        return new JAXBElement<Integer>(_RefillValueServiceFeeDaysExtended_QNAME, Integer.class, RefillValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionDaysExtended", scope = RefillValue.class)
    public JAXBElement<Integer> createRefillValueSupervisionDaysExtended(Integer value) {
        return new JAXBElement<Integer>(_RefillValueSupervisionDaysExtended_QNAME, Integer.class, RefillValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountRefillInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "dedicatedAccountRefillInformation", scope = RefillValue.class)
    public JAXBElement<ArrayOfDedicatedAccountRefillInformation> createRefillValueDedicatedAccountRefillInformation(ArrayOfDedicatedAccountRefillInformation value) {
        return new JAXBElement<ArrayOfDedicatedAccountRefillInformation>(_RefillValueDedicatedAccountRefillInformation_QNAME, ArrayOfDedicatedAccountRefillInformation.class, RefillValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillAmount1", scope = RefillValue.class)
    public JAXBElement<String> createRefillValueRefillAmount1(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationRefillAmount1_QNAME, String.class, RefillValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillAmount2", scope = RefillValue.class)
    public JAXBElement<String> createRefillValueRefillAmount2(String value) {
        return new JAXBElement<String>(_DedicatedAccountRefillInformationRefillAmount2_QNAME, String.class, RefillValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountValue2", scope = AccountRefill.class)
    public JAXBElement<String> createAccountRefillAccountValue2(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2AccountValue2_QNAME, String.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountValue1", scope = AccountRefill.class)
    public JAXBElement<String> createAccountRefillAccountValue1(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2AccountValue1_QNAME, String.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "creditClearanceDate", scope = AccountRefill.class)
    public JAXBElement<XMLGregorianCalendar> createAccountRefillCreditClearanceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2CreditClearanceDate_QNAME, XMLGregorianCalendar.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionPlanID", scope = AccountRefill.class)
    public JAXBElement<String> createAccountRefillPromotionPlanID(String value) {
        return new JAXBElement<String>(_AccountRefillPromotionPlanID_QNAME, String.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceClassOriginal", scope = AccountRefill.class)
    public JAXBElement<Integer> createAccountRefillServiceClassOriginal(Integer value) {
        return new JAXBElement<Integer>(_AccountRefillServiceClassOriginal_QNAME, Integer.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceClassTemporaryExpiryDate", scope = AccountRefill.class)
    public JAXBElement<XMLGregorianCalendar> createAccountRefillServiceClassTemporaryExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountRefillServiceClassTemporaryExpiryDate_QNAME, XMLGregorianCalendar.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionExpiryDate", scope = AccountRefill.class)
    public JAXBElement<XMLGregorianCalendar> createAccountRefillSupervisionExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2SupervisionExpiryDate_QNAME, XMLGregorianCalendar.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "accountFlags", scope = AccountRefill.class)
    public JAXBElement<AccountFlag> createAccountRefillAccountFlags(AccountFlag value) {
        return new JAXBElement<AccountFlag>(_AccountRefillAccountFlags_QNAME, AccountFlag.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceRemovalDate", scope = AccountRefill.class)
    public JAXBElement<XMLGregorianCalendar> createAccountRefillServiceRemovalDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2ServiceRemovalDate_QNAME, XMLGregorianCalendar.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDedicatedAccountInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "dedicatedAccountInformation", scope = AccountRefill.class)
    public JAXBElement<ArrayOfDedicatedAccountInformation> createAccountRefillDedicatedAccountInformation(ArrayOfDedicatedAccountInformation value) {
        return new JAXBElement<ArrayOfDedicatedAccountInformation>(_GetBalanceAndDateResponse2DedicatedAccountInformation_QNAME, ArrayOfDedicatedAccountInformation.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeeExpiryDate", scope = AccountRefill.class)
    public JAXBElement<XMLGregorianCalendar> createAccountRefillServiceFeeExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetBalanceAndDateResponse2ServiceFeeExpiryDate_QNAME, XMLGregorianCalendar.class, AccountRefill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccumulator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAccumulatorsResult", scope = GetAccumulatorsResponse.class)
    public JAXBElement<ArrayOfAccumulator> createGetAccumulatorsResponseGetAccumulatorsResult(ArrayOfAccumulator value) {
        return new JAXBElement<ArrayOfAccumulator>(_GetAccumulatorsResponseGetAccumulatorsResult_QNAME, ArrayOfAccumulator.class, GetAccumulatorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceAndDateResponse2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBalanceAndDateResult", scope = GetBalanceAndDateResponse.class)
    public JAXBElement<GetBalanceAndDateResponse2> createGetBalanceAndDateResponseGetBalanceAndDateResult(GetBalanceAndDateResponse2 value) {
        return new JAXBElement<GetBalanceAndDateResponse2>(_GetBalanceAndDateResponseGetBalanceAndDateResult_QNAME, GetBalanceAndDateResponse2 .class, GetBalanceAndDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintboolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "ServiceOfferings", scope = AccountDetails.class)
    public JAXBElement<ArrayOfKeyValueOfintboolean> createAccountDetailsServiceOfferings(ArrayOfKeyValueOfintboolean value) {
        return new JAXBElement<ArrayOfKeyValueOfintboolean>(_AccountDetailsServiceOfferings_QNAME, ArrayOfKeyValueOfintboolean.class, AccountDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeePeriodExpiryFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagServiceFeePeriodExpiryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagServiceFeePeriodExpiryFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeePeriodWarningActiveFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagServiceFeePeriodWarningActiveFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagServiceFeePeriodWarningActiveFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "activationStatusFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagActivationStatusFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagActivationStatusFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionPeriodWarningActiveFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagSupervisionPeriodWarningActiveFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagSupervisionPeriodWarningActiveFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionPeriodExpiryFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagSupervisionPeriodExpiryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagSupervisionPeriodExpiryFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "negativeBarringStatusFlag", scope = AccountFlag.class)
    public JAXBElement<Boolean> createAccountFlagNegativeBarringStatusFlag(Boolean value) {
        return new JAXBElement<Boolean>(_AccountFlagNegativeBarringStatusFlag_QNAME, Boolean.class, AccountFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "FafNumber", scope = FafInfo.class)
    public JAXBElement<String> createFafInfoFafNumber(String value) {
        return new JAXBElement<String>(_FafInfoFafNumber_QNAME, String.class, FafInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models", name = "Owner", scope = FafInfo.class)
    public JAXBElement<String> createFafInfoOwner(String value) {
        return new JAXBElement<String>(_FafInfoOwner_QNAME, String.class, FafInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetBalanceInfo.class)
    public JAXBElement<String> createGetBalanceInfoMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetBalanceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = SetDedicatedAccount.class)
    public JAXBElement<String> createSetDedicatedAccountIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, SetDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = SetDedicatedAccount.class)
    public JAXBElement<String> createSetDedicatedAccountMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, SetDedicatedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFafInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFaFListResult", scope = GetFaFListResponse.class)
    public JAXBElement<ArrayOfFafInfo> createGetFaFListResponseGetFaFListResult(ArrayOfFafInfo value) {
        return new JAXBElement<ArrayOfFafInfo>(_GetFaFListResponseGetFaFListResult_QNAME, ArrayOfFafInfo.class, GetFaFListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetFaFList.class)
    public JAXBElement<String> createGetFaFListMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetFaFList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAccountDetailsResult", scope = GetAccountDetailsResponse.class)
    public JAXBElement<AccountDetails> createGetAccountDetailsResponseGetAccountDetailsResult(AccountDetails value) {
        return new JAXBElement<AccountDetails>(_GetAccountDetailsResponseGetAccountDetailsResult_QNAME, AccountDetails.class, GetAccountDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionPlanProgressed", scope = RefillInformation.class)
    public JAXBElement<Boolean> createRefillInformationPromotionPlanProgressed(Boolean value) {
        return new JAXBElement<Boolean>(_RefillInformationPromotionPlanProgressed_QNAME, Boolean.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionRefillCounter", scope = RefillInformation.class)
    public JAXBElement<Integer> createRefillInformationPromotionRefillCounter(Integer value) {
        return new JAXBElement<Integer>(_RefillInformationPromotionRefillCounter_QNAME, Integer.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "supervisionDaysSurplus", scope = RefillInformation.class)
    public JAXBElement<Integer> createRefillInformationSupervisionDaysSurplus(Integer value) {
        return new JAXBElement<Integer>(_RefillInformationSupervisionDaysSurplus_QNAME, Integer.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceClassTemporaryExpiryDate", scope = RefillInformation.class)
    public JAXBElement<XMLGregorianCalendar> createRefillInformationServiceClassTemporaryExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountRefillServiceClassTemporaryExpiryDate_QNAME, XMLGregorianCalendar.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionRefillAccumulatedValue1", scope = RefillInformation.class)
    public JAXBElement<String> createRefillInformationPromotionRefillAccumulatedValue1(String value) {
        return new JAXBElement<String>(_RefillInformationPromotionRefillAccumulatedValue1_QNAME, String.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "progressionRefillCounter", scope = RefillInformation.class)
    public JAXBElement<Integer> createRefillInformationProgressionRefillCounter(Integer value) {
        return new JAXBElement<Integer>(_RefillInformationProgressionRefillCounter_QNAME, Integer.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "promotionRefillAccumulatedValue2", scope = RefillInformation.class)
    public JAXBElement<String> createRefillInformationPromotionRefillAccumulatedValue2(String value) {
        return new JAXBElement<String>(_RefillInformationPromotionRefillAccumulatedValue2_QNAME, String.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillValueTotal", scope = RefillInformation.class)
    public JAXBElement<RefillValue> createRefillInformationRefillValueTotal(RefillValue value) {
        return new JAXBElement<RefillValue>(_RefillInformationRefillValueTotal_QNAME, RefillValue.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "progressionRefillValue1", scope = RefillInformation.class)
    public JAXBElement<String> createRefillInformationProgressionRefillValue1(String value) {
        return new JAXBElement<String>(_RefillInformationProgressionRefillValue1_QNAME, String.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceFeeDaysSurplus", scope = RefillInformation.class)
    public JAXBElement<Integer> createRefillInformationServiceFeeDaysSurplus(Integer value) {
        return new JAXBElement<Integer>(_RefillInformationServiceFeeDaysSurplus_QNAME, Integer.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "progressionRefillValue2", scope = RefillInformation.class)
    public JAXBElement<String> createRefillInformationProgressionRefillValue2(String value) {
        return new JAXBElement<String>(_RefillInformationProgressionRefillValue2_QNAME, String.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefillValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "refillValuePromotion", scope = RefillInformation.class)
    public JAXBElement<RefillValue> createRefillInformationRefillValuePromotion(RefillValue value) {
        return new JAXBElement<RefillValue>(_RefillInformationRefillValuePromotion_QNAME, RefillValue.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "serviceClassCurrent", scope = RefillInformation.class)
    public JAXBElement<Integer> createRefillInformationServiceClassCurrent(Integer value) {
        return new JAXBElement<Integer>(_RefillInformationServiceClassCurrent_QNAME, Integer.class, RefillInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "identifier", scope = FixDedicatedAccountAAPCN.class)
    public JAXBElement<String> createFixDedicatedAccountAAPCNIdentifier(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateIdentifier_QNAME, String.class, FixDedicatedAccountAAPCN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = FixDedicatedAccountAAPCN.class)
    public JAXBElement<String> createFixDedicatedAccountAAPCNMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, FixDedicatedAccountAAPCN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "expiryDate", scope = DedicatedAccountInformation.class)
    public JAXBElement<XMLGregorianCalendar> createDedicatedAccountInformationExpiryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DedicatedAccountInformationExpiryDate_QNAME, XMLGregorianCalendar.class, DedicatedAccountInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "dedicatedAccountValue1", scope = DedicatedAccountInformation.class)
    public JAXBElement<String> createDedicatedAccountInformationDedicatedAccountValue1(String value) {
        return new JAXBElement<String>(_DedicatedAccountInformationDedicatedAccountValue1_QNAME, String.class, DedicatedAccountInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "dedicatedAccountValue2", scope = DedicatedAccountInformation.class)
    public JAXBElement<String> createDedicatedAccountInformationDedicatedAccountValue2(String value) {
        return new JAXBElement<String>(_DedicatedAccountInformationDedicatedAccountValue2_QNAME, String.class, DedicatedAccountInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargingResultInformationService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "chargingResultInformationService", scope = ChargingResultInformation.class)
    public JAXBElement<ChargingResultInformationService> createChargingResultInformationChargingResultInformationService(ChargingResultInformationService value) {
        return new JAXBElement<ChargingResultInformationService>(_ChargingResultInformationChargingResultInformationService_QNAME, ChargingResultInformationService.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "cost1", scope = ChargingResultInformation.class)
    public JAXBElement<String> createChargingResultInformationCost1(String value) {
        return new JAXBElement<String>(_ChargingResultInformationServiceCost1_QNAME, String.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency2", scope = ChargingResultInformation.class)
    public JAXBElement<String> createChargingResultInformationCurrency2(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency2_QNAME, String.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "reservationCorrelationID", scope = ChargingResultInformation.class)
    public JAXBElement<Integer> createChargingResultInformationReservationCorrelationID(Integer value) {
        return new JAXBElement<Integer>(_ChargingResultInformationReservationCorrelationID_QNAME, Integer.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "cost2", scope = ChargingResultInformation.class)
    public JAXBElement<String> createChargingResultInformationCost2(String value) {
        return new JAXBElement<String>(_ChargingResultInformationServiceCost2_QNAME, String.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "currency1", scope = ChargingResultInformation.class)
    public JAXBElement<String> createChargingResultInformationCurrency1(String value) {
        return new JAXBElement<String>(_GetBalanceAndDateResponse2Currency1_QNAME, String.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Provisioning.Models.Ucip", name = "chargingResultCode", scope = ChargingResultInformation.class)
    public JAXBElement<Integer> createChargingResultInformationChargingResultCode(Integer value) {
        return new JAXBElement<Integer>(_ChargingResultInformationChargingResultCode_QNAME, Integer.class, ChargingResultInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = UpdateSubscriberSegmentation2 .class)
    public JAXBElement<String> createUpdateSubscriberSegmentation2Msisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, UpdateSubscriberSegmentation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serviceId", scope = UpdateSubscriberSegmentation2 .class)
    public JAXBElement<ArrayOfint> createUpdateSubscriberSegmentation2ServiceId(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_UpdateSubscriberSegmentation2ServiceId_QNAME, ArrayOfint.class, UpdateSubscriberSegmentation2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccumulatorDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAccumulatorDetailsResult", scope = GetAccumulatorDetailsResponse.class)
    public JAXBElement<AccumulatorDetails> createGetAccumulatorDetailsResponseGetAccumulatorDetailsResult(AccumulatorDetails value) {
        return new JAXBElement<AccumulatorDetails>(_GetAccumulatorDetailsResponseGetAccumulatorDetailsResult_QNAME, AccumulatorDetails.class, GetAccumulatorDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = UpdateSubscriberSegmentation1 .class)
    public JAXBElement<String> createUpdateSubscriberSegmentation1Msisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, UpdateSubscriberSegmentation1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = GetAccountDetails.class)
    public JAXBElement<String> createGetAccountDetailsMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, GetAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "voucher", scope = Refill.class)
    public JAXBElement<String> createRefillVoucher(String value) {
        return new JAXBElement<String>(_RefillVoucher_QNAME, String.class, Refill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "msisdn", scope = Refill.class)
    public JAXBElement<String> createRefillMsisdn(String value) {
        return new JAXBElement<String>(_AdjustDedicatedAccountWithFixedDateMsisdn_QNAME, String.class, Refill.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalData1", scope = Refill.class)
    public JAXBElement<String> createRefillExternalData1(String value) {
        return new JAXBElement<String>(_AdjustBalanceExternalData1_QNAME, String.class, Refill.class, value);
    }

}
