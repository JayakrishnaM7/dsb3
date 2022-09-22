package com.ibm.org.services.impl;
 
import java.util.*;
 
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPostP;
import com.ibm.org.model.V1Bian3CorePayment1000UpdatepaymentPostResponseWrapper;
import com.ibm.org.services.V1Bian3CorePayment1000UpdatepaymentPostI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class V1Bian3CorePayment1000UpdatepaymentPostImpl implements V1Bian3CorePayment1000UpdatepaymentPostI {
 
    private static final Log logger = LogFactory.getLog(V1Bian3CorePayment1000UpdatepaymentPostImpl.class);
    
    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */   
    @Override
    public V1Bian3CorePayment1000UpdatepaymentPostResponseWrapper execute(V1Bian3CorePayment1000UpdatepaymentPostP requestParams){
        //TODO
        return new V1Bian3CorePayment1000UpdatepaymentPostResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
