package com.sarees.sarees.Dao;

import com.sarees.sarees.Entity.User;
import com.sarees.sarees.Repositry.RolesRepository;
import com.sarees.sarees.Repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(User user){
        boolean isSaved = false;
//        Role role = rolesRepository.getByRoleName(SareeShopConstants.STUDENT_ROLE);
//        role.setRoles(role);
//        person.setPwd(passwordEncoder.encode(person.getPwd()));
//        person = personRepository.save(person);
        if (null != user && user.getUser_id() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
