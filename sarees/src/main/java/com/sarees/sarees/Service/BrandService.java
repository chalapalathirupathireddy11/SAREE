package com.sarees.sarees.Service;

import com.sarees.sarees.Dao.BrandDao;
import com.sarees.sarees.Entity.Brand;
import com.sarees.sarees.ServiceInterface.BrandInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public abstract class BrandService implements BrandInterface {

    @Autowired
    private BrandDao dao;

    public Brand saveBrand(Brand brands) {
        return dao.saveBrands(brands);
    }

    public void updateBrand(Brand brands) {
        dao.saveBrands(brands);
    }

    public Optional<Brand> getBrandsById(int id) {
        return dao.getBrandsById(id);
    }

    public List<Brand> getAllBrands() {
        return dao.findAllBrands();
    }

    public List<Brand> saveAllBrands(List<Brand> brands) {
        return dao.SaveAllBrands(brands);
    }
}
