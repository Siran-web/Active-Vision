package com.active.vision.weapon.detection.dtos.detectionDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SummeryDetectionDto {

    private LocalDateTime detection_time;
    private List<Long> objectIds;

}
