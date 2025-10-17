package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Ethnic;
import com.sarees.sarees.ServiceInterface.EthnicInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order/EthnicWave")
@CrossOrigin("http://localhost:3001/")
public class EthnicController {

//    @Autowired
    private EthnicInterface anInterface;

    @PostMapping( "/saveAll/ethnicWave")
    public List<Ethnic> saveAllEthnicWave(@RequestBody List<Ethnic> ethnicWave){
        return anInterface.saveAllEthnicWave(ethnicWave);
    }

    @PostMapping( "/save/ethnicWave")
    public Ethnic saveEthnicWave(@RequestBody Ethnic ethnicWave){
        return anInterface.saveEthnicWave(ethnicWave);
    }
    @PutMapping("/update/ethnicWave")
    public Ethnic updateEthnicWave(@RequestBody Ethnic ethnicWave) {
        return anInterface.updateEthnicWave(ethnicWave);
    }
    @GetMapping("/update/ethnicWave/{id}")
    public Optional<Ethnic> getEthnicWaveById(@RequestParam int id) {
        return anInterface.getEthnicWaveById(id);
    }
    @GetMapping( "/fetchAll/EthnicWave")
    public List<Ethnic> findAllDesigns(){
        return anInterface.getAllEthnicWave();
    }
}
