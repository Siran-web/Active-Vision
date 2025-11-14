package com.active.vision.weapon.detection.repositories;

import com.active.vision.weapon.detection.dtos.detectionDtos.SummeryDetectionDto;
import com.active.vision.weapon.detection.entities.DetectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetectionRepository extends JpaRepository<DetectionEntity, Long>{

    List<SummeryDetectionDto> findTop20ByOrderByDetectedAtDesc();

    //video, images
    List<SummeryDetectionDto> findBySourceType(String sourceType);

}
