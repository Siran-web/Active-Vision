package com.active.vision.weapon.detection.repositories;

import com.active.vision.weapon.detection.dtos.objectDtos.ResponseObjectDto;
import com.active.vision.weapon.detection.entities.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectRepository extends JpaRepository<ObjectEntity , Long> {

    List<ResponseObjectDto> findByDetectionId(Long detectionId);

}
