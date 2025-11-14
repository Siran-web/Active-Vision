package com.active.vision.weapon.detection.dtos.objectDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SummeryObjectDto {

    private Long id;
    private String objectClass;

}
