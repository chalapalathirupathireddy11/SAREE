package com.sarees.sarees.Service;

import com.sarees.sarees.Dao.TypeDao;
import com.sarees.sarees.Entity.Type;
import com.sarees.sarees.ServiceInterface.TypeInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TypeService implements TypeInterface {
    @Autowired
    private TypeDao dao;
    public Type saveTypes(Type types) {
        return dao.saveTypes(types);
    }

    public Type updateTypes(Type types) {
        return dao.updateTypes(types);
    }

    public Optional<Type> getTypesById(int id) {

        return dao.getTypes(id);
    }

    public List<Type> getAllTypes() {

        return dao.getAllTypes();
    }

    public List<Type> saveAllTypes(List<Type> types) {
        return dao.saveAllTypes(types);
    }
}
