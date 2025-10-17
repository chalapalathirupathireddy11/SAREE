package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Products;
import com.sarees.sarees.Service.ProductService;
import com.sarees.sarees.ServiceInterface.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order/Products")
@CrossOrigin("http://localhost:3001/")
public class ProductController {

//    @Autowired
    private ProductInterface anInterface;

    @PostMapping("/saveAll/products")
    public List<Products> saveAllProducts(@RequestBody List<Products> products){
        return anInterface.saveAllProducts(products);
    }
    @PostMapping("/save/products")
    public ResponseEntity<?> saveProducts(@RequestPart("products") Products products, @RequestPart("file") MultipartFile file ){
        try {
            Products products1= anInterface.saveProducts(products,file);
            return new ResponseEntity<>(products1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
    @PutMapping( "/update/Products")
    public ResponseEntity<?> updateProducts(@RequestPart("products") Products products,
                                            @RequestPart( value = "file", required = false) MultipartFile file
            /* @RequestPart("boolean") boolean check*/) {
        try {
            Products products1= anInterface.updateProducts(products,file /*,check*/);
            return new ResponseEntity<>(products1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_MODIFIED);
        }
    }
    @GetMapping( "/update/Products/{id}")
    public Optional<Products> getProductsById(@RequestParam int id) {
        return anInterface.getProductsById(id);
    }
    @GetMapping( "/fetchAll/Products")
    public List<Products> findAllProducts(){
        return anInterface.getAllProducts();
    }
    @GetMapping("fetch/image/{productId}")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId){
        Products products=anInterface.getImageByProductId(productId);
        byte[] imageFile=products.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(products.getImageType()))
                .body(imageFile);
    }
    @GetMapping( "/fetch/Products/{id}")
    public Products findAllProducts(@PathVariable("id") int productId){
        return anInterface.getProducts(productId);
    }

    @GetMapping("/design/fetch/image/{designId}")
    public ResponseEntity<byte[]> getImageByDesignId(@PathVariable int designId){
        Products products=anInterface.getImageByDesignId(designId);
        byte[] imageFile=products.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(products.getImageType()))
                .body(imageFile);
    }
    @GetMapping("/brand/fetch/image/{brandId}")
    public ResponseEntity<byte[]> getImageByBrandId(@PathVariable int brandId){
        Products products=anInterface.getImageByBrandId(brandId);
        byte[] imageFile=products.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(products.getImageType()))
                .body(imageFile);
    }
    @GetMapping("/type/fetch/image/{typeId}")
    public ResponseEntity<byte[]> getImageByTypeId(@PathVariable int typeID){
        Products products=anInterface.getImageByTypeId(typeID);
        byte[] imageFile=products.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(products.getImageType()))
                .body(imageFile);
    }
    @GetMapping("/ethnic/fetch/image/{ethnicWaveeId}")
    public ResponseEntity<byte[]> getImageByEthnicId(@PathVariable int ethinicwaveId){
        Products products=anInterface.getImageByEthinicwaveId(ethinicwaveId);
        byte[] imageFile=products.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(products.getImageType()))
                .body(imageFile);
    }

    @DeleteMapping("/delete/product/{value}")
    public String ProductDelete(@PathVariable int value){
        return anInterface.ProductDelete(value);
    }
}
