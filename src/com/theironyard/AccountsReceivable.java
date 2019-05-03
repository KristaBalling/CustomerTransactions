package com.theironyard;

public class AccountsReceivable {

    private CustomerTransaction transactionObject;

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
        //sends the invoice
    }
}
