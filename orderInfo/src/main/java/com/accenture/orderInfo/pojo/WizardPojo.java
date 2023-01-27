package com.accenture.orderInfo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class WizardPojo {

    @JsonProperty("wizard_id")
    private Long wizard_id;

    @JsonProperty("wizard_name")
    private String wizard_name;

    @JsonProperty("wizard_age")
    private int age;

    @JsonProperty("wizard_active")
    private String active_wizard;
}
