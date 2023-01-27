package com.accenture.orderInfo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MagicPojo {

    @JsonProperty("magic_id")
    private Long magic_id;

    @JsonProperty("magic_name")
    private String magic_name;

    @JsonProperty("magic_desc")
    private String magic_desc;

    @JsonProperty("magic_ageLimit")
    private Integer magic_ageLimit;

    @JsonProperty("magic_stock")
    private Integer magic_stock;
}
