package com.sarees.sarees.ServiceInterface;

import com.sarees.sarees.Entity.Products;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ProductInterface {
    List<Products> saveAllProducts(List<Products> products);

    Products saveProducts(Products products, MultipartFile file) throws IOException;

    Products updateProducts(Products products, MultipartFile file) throws IOException;

    Optional<Products> getProductsById(int id);

    List<Products> getAllProducts();

    Products getImageByProductId(int productId);

    Products getProducts(int productId);

    Products getImageByDesignId(int designId);

    Products getImageByBrandId(int brandId);

    Products getImageByTypeId(int typeID);

    Products getImageByEthinicwaveId(int ethinicwaveId);

    String ProductDelete(int value);
}
