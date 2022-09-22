package com.ibm.org.services;

import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPostP;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPostResponseWrapper;

public interface V1Bian3CorePayment1000UpdatepaymentPostI {

    public V1Bian3CorePayment1000UpdatepaymentPostResponseWrapper execute(V1Bian3CorePayment1000UpdatepaymentPostP requestParams) throws Exception;

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
