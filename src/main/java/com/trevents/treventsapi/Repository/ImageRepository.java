package com.trevents.treventsapi.Repository;

import com.trevents.treventsapi.Model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository <ImageModel, Integer> {
}
