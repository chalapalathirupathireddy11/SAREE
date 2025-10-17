package com.sarees.sarees.ServiceInterface;

import com.sarees.sarees.Entity.Type;

import java.util.List;
import java.util.Optional;

public interface TypeInterface {
    List<Type> saveAllTypes(List<Type> types);

    Type saveTypes(Type types);

    Type updateTypes(Type types);

    List<Type> getAllTypes();

    Optional<Type> getTypesById(int id);
}
