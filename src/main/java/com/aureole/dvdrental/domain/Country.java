package com.aureole.dvdrental.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country implements Serializable {
    private Integer countryId;

    private String country;

    private Date lastUpdate;


}
