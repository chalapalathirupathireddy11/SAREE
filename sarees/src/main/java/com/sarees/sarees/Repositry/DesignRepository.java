package com.sarees.sarees.Repositry;

import com.sarees.sarees.Entity.Design;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignRepository extends JpaRepository<Design,Integer> {
}
