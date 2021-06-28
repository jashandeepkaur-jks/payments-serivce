/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsdeveloperblog.paymentservice.data;

import java.io.Serializable;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class PaymentEntity implements Serializable {
    private static final long serialVersionUID = 5313493413859894403L;

    @Id
    private String paymentId;
    public String orderId;
    public String status;


}
