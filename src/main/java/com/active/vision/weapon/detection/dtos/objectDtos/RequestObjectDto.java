package com.active.vision.weapon.detection.dtos.objectDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestObjectDto {

    private String objectClass;

    private Double x1;
    private Double y1;
    private Double x2;
    private Double y2;

}
