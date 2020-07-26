package com.hari.virtualq.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {
    private String customerName;
    private String customerId;
}
