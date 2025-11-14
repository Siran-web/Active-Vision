package com.active.vision.weapon.detection.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "object_table")
public class ObjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objectClass;

    private Double x1;
    private Double y1;
    private Double x2;
    private Double y2;

    @ManyToOne
    @JoinColumn(name = "detection_id")
    private DetectionEntity detection;
}
