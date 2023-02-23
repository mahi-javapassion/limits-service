package com.mahi.javapassion.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Limits {
    private int minimum;
    private int maximum;
}
