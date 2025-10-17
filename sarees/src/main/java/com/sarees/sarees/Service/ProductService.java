package com.sarees.sarees.Service;

import com.sarees.sarees.Dao.ProductsDao;
import com.sarees.sarees.Entity.Products;
import com.sarees.sarees.ServiceInterface.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements ProductInterface {
    @Autowired
    private ProductsDao dao;
    public Products saveProducts(Products products, MultipartFile file) throws IOException {
        return dao.saveProducts(products,file);
    }

    public Products updateProducts(Products products, MultipartFile file /*, boolean check*/) throws IOException {
        return dao.updateProducts(products,file /*,check*/);
    }

    public Optional<Products> getProductsById(int id) {
        return dao.getProductsById(id);
    }

    public List<Products> getAllProducts() {
        return dao.getAllProducts();
    }

    public List<Products> saveAllProducts(List<Products> products) {
        return dao.saveAllProducts(products);
    }

    public Products getImageByProductId(int productId) {
        return dao.getImageByProductId(productId).get();
    }

    public Products getProducts(int productId) {
        return dao.getProducts(productId);
    }

    public Products getImageByDesignId(int designId) {
        return dao.getImageByDesignId(designId);
    }

    public Products getImageByBrandId(int brandId) {
        return dao.getImageByBrandId(brandId);
    }

    public Products getImageByTypeId(int typeID) {
        return dao.getImageByTypeId(typeID);
    }

    public Products getImageByEthinicwaveId(int ethnicwaveId) {
        return dao.getImageByEthinicwaveId(ethnicwaveId);
    }

    public String ProductDelete(int value) {
        return dao.ProductDelete(value);
    }
}
