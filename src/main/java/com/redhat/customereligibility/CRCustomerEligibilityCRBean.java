package com.redhat.customereligibility;

import com.redhat.bian.servicedomain.models.CRCustomerEligibilityAssessmentEvaluateOutputModelCustomerEligibilityAssessmentInstanceRecord;
import com.redhat.bian.servicedomain.models.CRCustomerEligibilityAssessmentUpdateOutputModel;
import org.apache.camel.Exchange;

import java.util.Date;

public class CRCustomerEligibilityCRBean {

    public CustomerEligibilityCRModel setCustomerEligibilityCRModel(Exchange exchange) {

        String customerReference = (String) exchange.getProperty("customerReference");
        Date crDate = (Date) exchange.getProperty("exchangeDate");
        String productType = (String) exchange.getProperty("productUsage");
        String eligibility = (String) exchange.getProperty("eligibility");



        CustomerEligibilityCRModel customerEligibilityCRModel = new CustomerEligibilityCRModel();
        CustomerProductId customerProductId = new CustomerProductId();
        customerProductId.setCustomerReference(customerReference);
        customerProductId.setProductServiceType(productType);

        customerEligibilityCRModel.setCustomerProductServiceTypeEligibility(eligibility);
        customerEligibilityCRModel.setCustomerProductId(customerProductId);
        customerEligibilityCRModel.setEligibilityDate(crDate);
        System.out.println(customerEligibilityCRModel.getCustomerProductServiceTypeEligibility()+customerEligibilityCRModel.getCustomerProductId().getCustomerReference());
        return customerEligibilityCRModel;
    }

    public CustomerEligibilityCRModel getCustomerEligibilityCRModel(Exchange exchange) {
        return null;
    }
}
