package com.active.vision.weapon.detection.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detection_table")
public class DetectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String image_source;
    private String file_name;

    private LocalDateTime detection_time;

    @OneToMany(mappedBy = "detection" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ObjectEntity> objects;

}
