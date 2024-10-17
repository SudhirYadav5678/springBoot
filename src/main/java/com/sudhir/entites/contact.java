package com.sudhir.entites;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String pricture;
    private boolean favorite = false;
    // private List<String> socialLinks = new ArrayList<>();
    @ManyToOne
    private user user;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLinks> links = new ArrayList<>();

}
