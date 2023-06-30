package com.dku.council.domain.homebus.model.entity;

import com.dku.council.global.base.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class HomeBus extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "bus_id")
    private Long id;

    private String label;

    private String path;

    private String destination;

    @Builder
    private HomeBus(String label, String path, String destination) {
        this.label = label;
        this.path = path;
        this.destination = destination;
    }
}
