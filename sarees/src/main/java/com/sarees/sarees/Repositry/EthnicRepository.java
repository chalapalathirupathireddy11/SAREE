package com.sarees.sarees.Repositry;

import com.sarees.sarees.Entity.Ethnic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EthnicRepository extends JpaRepository<Ethnic,Integer> {
}
