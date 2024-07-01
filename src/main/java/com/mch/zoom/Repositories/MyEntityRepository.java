package com.mch.zoom.Repositories;

import com.mch.zoom.Model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
