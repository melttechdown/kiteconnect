package com.app.kiteconnect.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TradeDetails")
@XmlRootElement(name = "TradeDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class TradeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String thresholdMax;
    @Column
    private String soldoutMin;
    @Column
    private double price;
    @Column
    private double amount;

}
