package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.Ethnic;
import com.sarees.sarees.Repositry.EthnicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EthnicDao {
    @Autowired
    private EthnicRepository repository;

    public Ethnic saveEthnicWave(Ethnic ethnic) {
        return repository.save(ethnic);
    }

    public Ethnic updateEthnicWave(Ethnic ethnicWave) {
        return repository.save(ethnicWave);
    }

    public Optional<Ethnic> getEthnicWaveById(int id) {
        return repository.findById(id);
    }


    public List<Ethnic> getAllEthnicWave() {
        return repository.findAll();
    }

    public List<Ethnic> saveAllEthinicWave(List<Ethnic> ethnicWave) {
        return repository.saveAll(ethnicWave);
    }
}
