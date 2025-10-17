package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.Type;
import com.sarees.sarees.Repositry.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypeDao {

    @Autowired
    private TypeRepository repository;
    public List<Type> getAllTypes() {
        return repository.findAll();
    }

    public Optional<Type> getTypes(int id) {
        return repository.findById(id);
    }

    public Type updateTypes(Type types) {
        return repository.save(types);
    }

    public Type saveTypes(Type types) {
        return repository.save(types);
    }

    public List<Type> saveAllTypes(List<Type> types) {
        return repository.saveAll(types);
    }
}
