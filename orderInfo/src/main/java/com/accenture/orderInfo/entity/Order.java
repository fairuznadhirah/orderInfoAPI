package com.accenture.orderInfo.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Integer wizardId;
    Integer wandId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWizardId() {
        return wizardId;
    }

    public void setWizardId(int wizardId) {
        this.wizardId = wizardId;
    }

    public int getWandId() {
        return wandId;
    }

    public void setWandId(int wandId) {
        this.wandId = wandId;
    }
}
