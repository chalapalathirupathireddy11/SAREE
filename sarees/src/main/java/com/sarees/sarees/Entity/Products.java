package com.sarees.sarees.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private int brandsId;
    private int typesId;
    private int designsId;
    private int ethnicWaveId;
    private double price;
    private String description;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Set<User> users = new HashSet<>();
}
