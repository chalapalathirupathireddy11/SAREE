package com.sarees.sarees.Service;

import com.sarees.sarees.Dao.EthnicDao;
import com.sarees.sarees.Entity.Ethnic;
import com.sarees.sarees.ServiceInterface.EthnicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EthnicService implements EthnicInterface {
    @Autowired
    private EthnicDao dao;
    public Ethnic saveEthnicWave(Ethnic ethnicWave) {
        return dao.saveEthnicWave(ethnicWave);
    }

    public Ethnic updateEthnicWave(Ethnic ethnicWave) {
        return dao.updateEthnicWave(ethnicWave);
    }

    public Optional<Ethnic> getEthnicWaveById(int id) {
        return dao.getEthnicWaveById(id);
    }

    public List<Ethnic> getAllEthnicWave() {
        return dao.getAllEthnicWave();
    }

    public List<Ethnic> saveAllEthnicWave(List<Ethnic> ethnicWave) {
        return dao.saveAllEthinicWave(ethnicWave);
    }
}
