package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.Products;
import com.sarees.sarees.Repositry.ProductsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@Slf4j
public class ProductsDao {
    @Autowired
    private ProductsRepository repository;
    public List<Products> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Products> getProductsById(int id) {
        return repository.findById(id);
    }

    public Products updateProducts(Products products, MultipartFile file /*, boolean check*/) throws IOException {
        if(!file.isEmpty()){
            products.setImageName(file.getOriginalFilename());
            products.setImageType(file.getContentType());
            products.setImageData(file.getBytes());
        }
        return repository.save(products);
    }

    public Products saveProducts(Products products, MultipartFile file) throws IOException {
        products.setImageName(file.getOriginalFilename());
        products.setImageType(file.getContentType());
        products.setImageData(file.getBytes());
        return repository.save(products);
    }



    public List<Products> saveAllProducts(List<Products> products) {
        List<Products> products1=new ArrayList<>();
//        for (Products p:products)
//        {
//            products1.add(repositry.save(p));
//        }

        log.info(String.valueOf(products1.addAll(repository.saveAll(products))));
        return products1;
    }

    public Optional<Products> getImageByProductId(int productId) {


        return repository.findById(productId);
    }

    public Products getProducts(int productId) {
        return repository.findById(productId).get();
    }

    public Products getImageByEthinicwaveId(int ethnicwaveId) {
        return null;

    }

    public Products getImageByTypeId(int typeID) {
        return null;
    }

    public Products getImageByBrandId(int brandId) {
        return null;
    }

    public Products getImageByDesignId(int designId) {
        return null;
    }

    public String ProductDelete(int value) {
        try {
            repository.deleteById(value);
            return "product has been deleted";
        } catch (Exception e) {
            return "product not deleted";
        }


    }
}
