package com.sarees.sarees.ServiceInterface;

import com.sarees.sarees.Entity.Design;

import java.util.List;
import java.util.Optional;

public interface DesignInterface {
    List<Design> saveAllDesign(List<Design> designs);

    Design saveDesign(Design designs);

    Design updateDesigns(Design designs);

    Optional<Design> getDesignsById(int id);

    List<Design> getAllDesigns();
}
