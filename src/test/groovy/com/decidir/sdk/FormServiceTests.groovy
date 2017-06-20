package com.decidir.sdk

import com.decidir.sdk.dto.Currency
import com.decidir.sdk.dto.Customer
import com.decidir.sdk.dto.DataForm
import com.decidir.sdk.dto.PaymentForm
import com.decidir.sdk.dto.PaymentType
import com.decidir.sdk.dto.SiteForm
import spock.lang.Specification

/**
 * Created by biandra on 19/06/17.
 */
class FormServiceTests extends Specification {

    public static final String secretAccessToken = '00290815'
    public static final String apiUrl = "http://localhost:9006"

    def decidir

    def setup(){
        decidir = new Decidir(secretAccessToken, apiUrl, 15)
    }

    def "validate"() {
        setup:
        def siteForm = new SiteForm()
        siteForm.transaction_id = UUID.randomUUID().toString()
        def customer = new Customer()
        customer.id = "maxi"
        customer.email = "maxi@gmail.com"
        def payment = new PaymentForm()
        payment.payment_type = PaymentType.SINGLE
        payment.currency = Currency.ARS
        payment.amount = 5
        payment.sub_payments = []

        def dataForm = new DataForm()
        dataForm.site = siteForm
        dataForm.customer = customer
        dataForm.payment = payment
        dataForm.success_url = "success_url"
        dataForm.cancel_url = "cancel_url"

        when:
        def result = decidir.validate(dataForm)

        then:
        result.status == 201
        result.result.hash != null
    }
}