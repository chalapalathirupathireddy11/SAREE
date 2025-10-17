package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.Design;
import com.sarees.sarees.Repositry.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DesignDao {
    @Autowired
    private DesignRepository repository;
    public Design saveDesigns(Design designs) {
        return repository.save(designs);
    }

    public Design updateDesigns(Design designs) {
        return repository.save(designs);
    }

    public Optional<Design> getDesignsByID(int id) {
        return repository.findById(id);
    }

    public List<Design> saveDesigns() {
        return repository.findAll();
    }

    public List<Design> saveAllDesigns(List<Design> designs) {
        return repository.saveAll(designs);
    }
}
