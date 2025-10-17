package com.sarees.sarees.ServiceInterface;

import com.sarees.sarees.Entity.Ethnic;

import java.util.List;
import java.util.Optional;

public interface EthnicInterface {
    List<Ethnic> saveAllEthnicWave(List<Ethnic> ethnicWave);

    Ethnic saveEthnicWave(Ethnic ethnicWave);

    Ethnic updateEthnicWave(Ethnic ethnicWave);

    Optional<Ethnic> getEthnicWaveById(int id);

    List<Ethnic> getAllEthnicWave();
}
