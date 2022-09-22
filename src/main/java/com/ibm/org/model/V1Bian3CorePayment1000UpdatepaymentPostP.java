package com.ibm.org.model;

import com.ibm.org.model.Updatepayment;
import org.springframework.http.ResponseEntity;

public class V1Bian3CorePayment1000UpdatepaymentPostP {

    private Updatepayment updatepayment;

    public V1Bian3CorePayment1000UpdatepaymentPostP() {

    }

    public V1Bian3CorePayment1000UpdatepaymentPostP(Updatepayment updatepayment) {
        this.updatepayment = updatepayment;
    }

    public Updatepayment getUpdatepayment () {
        return updatepayment;
    }

    public void setUpdatepayment (Updatepayment updatepayment) {
        this.updatepayment = updatepayment;
    }

}
