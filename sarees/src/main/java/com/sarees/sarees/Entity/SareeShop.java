package com.sarees.sarees.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "sareeshop")
public class SareeShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shopId;

    @NotBlank(message="Name must not be blank")
    @Size(min=3, message="Name must be at least 3 characters long")
    private String name;

    @OneToMany(mappedBy = "sareeShop", fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST,targetEntity = User.class)
    private Set<User> users;
}
