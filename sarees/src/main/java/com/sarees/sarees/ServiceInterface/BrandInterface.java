package com.sarees.sarees.ServiceInterface;

import com.sarees.sarees.Entity.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandInterface {
    List<Brand> saveAllBrands(List<Brand> brands);

    void updateBrand(Brand brands);

    Brand saveBrand(Brand brands);

    Optional<Brand> getBrandsById(int id);

    List<Brand> getAllBrands();
}
