package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Design;
import com.sarees.sarees.ServiceInterface.DesignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/order/Design")
@CrossOrigin("http://localhost:3001/")
public class DesignController {

//    @Autowired
    private DesignInterface anInterface;
    @PostMapping( "/saveAll/designs")
    public List<Design> saveAllDesign(@RequestBody List<Design> designs){
        return anInterface.saveAllDesign(designs);
    }
    @PostMapping( "/save/designs")
    public Design saveDesign(@RequestBody Design designs){
        return anInterface.saveDesign(designs);
    }
    @PutMapping("/update/designs")
    public Design updateDesigns(@RequestBody Design designs) {
        return anInterface.updateDesigns(designs);
    }
    @GetMapping("/update/Designs/{id}")
    public Optional<Design> getDesignsById(@RequestParam int id) {
        return anInterface.getDesignsById(id);
    }
    @GetMapping("/fetchAll/Designs")
    public List<Design> findAllDesigns(){
        return anInterface.getAllDesigns();
    }
}
