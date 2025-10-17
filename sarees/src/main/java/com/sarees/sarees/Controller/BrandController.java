package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Brand;
import com.sarees.sarees.Service.BrandService;
import com.sarees.sarees.ServiceInterface.BrandInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order/Brand")
@CrossOrigin("http://localhost:3001/")
public class BrandController {
//    @Autowired
    private BrandInterface anInterface;

    @PostMapping("/saveAll/Brand")
    public List<Brand> saveAllBrand(@RequestBody List<Brand> brands){
        return anInterface.saveAllBrands(brands);
    }
    @PostMapping("/save/Brand")
    public Brand saveBrand(@RequestBody Brand brands){
        return anInterface.saveBrand(brands);
    }
    @PutMapping("/update/Brand")
    public void updateBrand(@RequestBody Brand brands) {
        anInterface.updateBrand(brands);
    }
    @GetMapping( "/update/Brand/{id}")
    public Optional<Brand> getBrandById(@RequestParam int id) {
        return anInterface.getBrandsById(id);
    }
    @GetMapping("/fetchAll/Brand")
    public List<Brand> findAllBrands(){
        return anInterface.getAllBrands();
    }
}
