package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Type;
import com.sarees.sarees.Service.TypeService;
import com.sarees.sarees.ServiceInterface.TypeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order/Types")
@CrossOrigin("http://localhost:3001/")
public class TypeController {


//    @Autowired
    private TypeInterface anInterface;

    @PostMapping( "/saveAll/types")
    public List<Type> saveAllTypes(@RequestBody List<Type> types){
        return anInterface.saveAllTypes(types);
    }

    @PostMapping( "/save/types")
    public Type saveTypes(@RequestBody Type types){
        return anInterface.saveTypes(types);
    }
    @PutMapping("/update/types")
    public Type updateTypes(@RequestBody Type types) {
        return anInterface.updateTypes(types);
    }
    @GetMapping( "/update/Types/{id}")
    public Optional<Type> getTypesById(@RequestParam int id) {
        return anInterface.getTypesById(id);
    }
    @GetMapping("/fetchAll/types")
    public List<Type> findAllTypes(){
        return anInterface.getAllTypes();
    }
}
