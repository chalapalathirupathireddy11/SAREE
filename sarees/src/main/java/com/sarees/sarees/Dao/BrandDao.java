package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.Brand;
import com.sarees.sarees.Repositry.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BrandDao {
    @Autowired
    private BrandRepository repository;
    public Brand saveBrands(Brand brands) {
        return repository.save(brands);
    }

    public Optional<Brand> getBrandsById(int id) {

        return repository.findById(id);
    }

    public List<Brand> findAllBrands() {
        return repository.findAll();
    }

    public List<Brand> SaveAllBrands(List<Brand> brands) {
        return repository.saveAll(brands);
    }
}
