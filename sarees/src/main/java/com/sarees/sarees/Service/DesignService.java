package com.sarees.sarees.Service;

import com.sarees.sarees.Dao.DesignDao;
import com.sarees.sarees.Entity.Design;
import com.sarees.sarees.ServiceInterface.DesignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DesignService implements DesignInterface {
    @Autowired
    private DesignDao dao;
    public Design saveDesign(Design designs) {
        return dao.saveDesigns(designs);
    }

    public Design updateDesigns(Design designs) {
        return dao.updateDesigns(designs);
    }

    public Optional<Design> getDesignsById(int id) {
        return dao.getDesignsByID(id);
    }

    public List<Design> getAllDesigns() {
        return dao.saveDesigns();
    }

    public List<Design> saveAllDesign(List<Design> designs) {
        return dao.saveAllDesigns(designs);
    }
}
