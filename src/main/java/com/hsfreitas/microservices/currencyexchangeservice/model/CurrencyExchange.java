package com.hsfreitas.microservices.currencyexchangeservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class CurrencyExchange {
    @Id
    @NonNull private Long id;
    @Column(name= "currency_from")
    @NonNull  private String from;
    @Column(name= "currency_to")
    @NonNull  private String to;
    @NonNull private BigDecimal conversionMultiple;
    private String environment;

}
